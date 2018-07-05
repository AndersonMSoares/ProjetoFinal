
package DAO;

import Classes.Estado;
import conexao.ConnectionFactory;
import static conexao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class EstadoDAO {
    ConnectionFactory conexao= new ConnectionFactory();
    
    public  int BuscarIDEstado(String estado) throws SQLException  {
       try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            
            rs = stmt.executeQuery("Select * from estado where nome_estado = '"+estado+"';");
            while (rs.next()){
                Estado e = new Estado();   
                e.setId_estado(rs.getInt(1));
                e.setNome_estado(rs.getString(2));
                e.setRegiao_estado(rs.getString(3));
                return e.getId_estado();
            } 
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Estado não encontrado!");   
        } return 0;
    }
    
    public  String BuscarNomesEstado() throws SQLException  {
        String a = "0";
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            
            rs = stmt.executeQuery("Select id_estado, nome_estado, regiao_estado from estado;");
            while (rs.next()){
                Estado e = new Estado();   
                e.setId_estado(rs.getInt(1));
                e.setNome_estado(rs.getString(2));
                e.setRegiao_estado(rs.getString(3));
                return e.getNome_estado();
            } 
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Estado não encontrado!");   
        } return a;
    }
    
    public List BuscarNomeEstado() {
        List <Estado> estado = new ArrayList<>();
        int x=0;
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("Select `id_estado`, `nome_estado`, `regiao_estado` from estado\n" +
            "GROUP by regiao_estado;");
            while (rs.next()){
                Estado c = new Estado();
                c.setId_estado(rs.getInt(1));         
                c.setNome_estado(rs.getString(2));
                c.setRegiao_estado(rs.getString(3));
                estado.add(c);
                x++;
            }     
            return estado;   
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Estado não encontrado!");
        } return null;
    }
    
    public Estado BuscarNomeEstado(int id ) {
        List <Estado> estado = new ArrayList<>();
        
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("Select `id_estado`, `nome_estado`, `regiao_estado` from estado where `id_estado` ="+ id+";");
            while (rs.next()){
                Estado c = new Estado();
                c.setId_estado(rs.getInt(1));         
                c.setNome_estado(rs.getString(2));
                c.setRegiao_estado(rs.getString(3));
                estado.add(c);
                return c;
            }     
               
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Estado não encontrado!");
        } return null;
    }
    
    public  ResultSet BuscarPessoasPorRegiao(String regiao) throws SQLException  {
        List <Estado> Estado= new ArrayList<>();
        int x=0;
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT nome_pessoas, cpf_pessoas, titulo_de_eleitor_pessoas, idade_pessoas, cidade.nome_cidade, estado.nome_estado, estado.regiao_estado from pessoas\n" +
"            inner join cidade on cidade.id_cidade = pessoas.Cidade_id_cidade\n" +
"            inner join estado on estado.id_estado = cidade.Estado_id_estado\n" +
"            where estado.regiao_estado = '"+regiao+"';");

            return rs;
      
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Regiao  não encontrada!");

        } return null;
    }
    
    public  ResultSet BuscarCandidatosPorRegiao(String regiao) throws SQLException  {
        List <Estado> Estado= new ArrayList<>();
        int x=0;
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT nome_pessoas, cpf_pessoas, titulo_de_eleitor_pessoas, idade_pessoas, "
             + "cidade.nome_cidade, estado.nome_estado, partido.nome_partido, cargo.nome_cargo, "
            + "estado.regiao_estado from pessoas\n" +
            "inner join candidato on candidato.Pessoas_cpf_pessoas = pessoas.cpf_pessoas\n" +
            "inner join partido on partido.id_partido = candidato.Partido_id_partido\n" +
            "INNER JOIN cargo on cargo.id_cargo = candidato.Cargo_id_cargo\n" +
            "inner join cidade on cidade.id_cidade = pessoas.Cidade_id_cidade\n" +
            "inner join estado on estado.id_estado = cidade.Estado_id_estado\n" +
            "where estado.regiao_estado = '"+regiao+"';");

            return rs;
      
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Regiao  não encontrada!");

        } return null;
    }
    
 
}

