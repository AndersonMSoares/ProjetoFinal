
package DAO;

import Classes.Partido;
import conexao.ConnectionFactory;
import static conexao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PartidoDAO {
    ConnectionFactory conexao= new ConnectionFactory();

        
    public  int RetornaIdPartido(String nome)   {
            int x=0;
            try{
                Connection connection = getConnection(); 
                Statement stmt = (Statement) connection.createStatement();
                ResultSet rs;
                rs = stmt.executeQuery("SELECT * FROM `partido` WHERE `nome_partido` = '"+nome+"';");
                while (rs.next()){
                    Partido partido = new Partido();
                    partido.setId_partido(rs.getInt(1));         
                    partido.setData_criacao_partido(rs.getString(2));
                    partido.setNome_fundador_partido(rs.getString(3));
                    partido.setNome_partido(rs.getString(4));
                    return partido.getId_partido();   
                }
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Id do cargo não encontrado!");
            } return 0;
        }
    
    public List BuscarNomePartido() {
        List <Partido> partido = new ArrayList<>();
        int x=0;
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT `id_partido`, `data_criacao_partido`, `nome_fundador_partido`, `nome_partido` FROM partido;");
            while (rs.next()){
                Partido p = new Partido();
                p.setId_partido(rs.getInt(1));         
                p.setData_criacao_partido(rs.getString(2));
                p.setNome_fundador_partido(rs.getString(3));
                p.setNome_partido(rs.getString(4));
                partido.add(p);
                x++;
            }
            return partido;            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Partido não encontrado!");
        } return null;
    }
    
    public  Partido BuscarIdPartido(int partido) throws SQLException  {
        System.out.println("dado de entrada"+partido);
        List <Partido> par  = new ArrayList<>();

        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM `partido` WHERE `id_partido` = '" +partido+ "';");

            while (rs.next()){
                Partido p = new Partido();
                p.setId_partido(rs.getInt(1));
                System.out.println("id:"+p.getId_partido());
                p.setNome_partido(rs.getString(2));
                p.setNome_fundador_partido(rs.getString(3));
                p.setData_criacao_partido(rs.getString(4));
                par.add(p);
                System.out.println("p:"+par);
                return p;
                
            }
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Partido não encontrado!");
            
        } return null;
    }
    
     public  ResultSet BuscarTodosPartido() throws SQLException  {  
        List <Partido> partido   = new ArrayList<>();
        
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            rs = stmt.executeQuery("select id_partido, nome_partido, nome_fundador_partido, data_criacao_partido from partido;");               
            return rs;
         
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Partido não encontrado!");  
        } return null; 
    }
}
