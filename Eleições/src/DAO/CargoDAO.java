
package DAO;

import Classes.Cargo;
import conexao.ConnectionFactory;
import static conexao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CargoDAO {
    ConnectionFactory conexao= new ConnectionFactory();
    
    public List BuscarNomeCargo() {
        List <Cargo> cargo = new ArrayList<>();
        int x=0;
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM `cargo` ;");
            while (rs.next()){
                Cargo c = new Cargo();
                c.setId_cargo(rs.getInt(1));         
                c.setNome_cargo(rs.getString(2));
                c.setSalario_cargo(rs.getInt(3));
                cargo.add(c);
                x++;
            }
            return cargo;           
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Cargo não encontrado!");
        } return null;
    }
    
    public  int RetornaIdCargo(String nome)   {
        int x=0;
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM `cargo` WHERE `nome_cargo` = '"+nome+"';");
            while (rs.next()){
                Cargo cargo = new Cargo();
                cargo.setId_cargo(rs.getInt(1));         
                cargo.setNome_cargo(rs.getString(2));
                cargo.setSalario_cargo(rs.getInt(3));
                return cargo.getId_cargo();   
            }
            
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Id do cargo não encontrado!");

        } return 0;
    }
    
     public  Cargo BuscarIdCargo(int cargo) throws SQLException  {
        List <Cargo> par  = new ArrayList<>();

        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM `cargo` WHERE `id_cargo` = '" +cargo+ "';");

            while (rs.next()){
                Cargo p = new Cargo();
                p.setId_cargo(rs.getInt(1));
                p.setNome_cargo(rs.getString(2));
                p.setSalario_cargo(rs.getInt(3));
                par.add(p);
                return p;
                
            }
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cargo não encontrado!");
            
        } return null;
    }
     
      public  ResultSet BuscarTodosCargos() throws SQLException  {  
        List <Cargo> cargo   = new ArrayList<>();
        
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            rs = stmt.executeQuery("select id_cargo, nome_cargo, salario_cargo from cargo;");               
            return rs;
         
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cargo não encontrado!");  
        } return null; 
    }
}

   

