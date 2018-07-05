
package DAO;

import Classes.Cidade;
import Classes.Estado;
import Classes.Pessoas;
import conexao.ConnectionFactory;
import static conexao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PessoasDAO {

    ConnectionFactory conexao= new ConnectionFactory();
    CidadeDAO cidadeDAO = new CidadeDAO();
    
   
    public  int BuscarCpf(int cpf) throws SQLException  {  
       try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;

            rs = stmt.executeQuery("Select * from pessoas where cpf_pessoas = " +cpf+ ";");
            while (rs.next()){
                Pessoas p = new Pessoas();
                p.setNome_pessoas(rs.getString(1));
                p.setCpf_pessoas(rs.getInt(2));
                p.setTitulo_de_eleitor_pessoas(rs.getInt(3));
                p.setIdade_pessoas(rs.getInt(4));
                p.setId_cidade(rs.getInt(5));
                return p.getCpf_pessoas();
            }
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cpf não encontrado!");  
        } return 0; 
    }
    
    
    public  Pessoas BuscarCpfPessoa(int cpf) throws SQLException  {
        List <Pessoas> pessoas  = new ArrayList<>();

        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM `pessoas` WHERE `cpf_pessoas` = '" +cpf+ "';");

            while (rs.next()){
                Pessoas p = new Pessoas();
                p.setNome_pessoas(rs.getString(1));
                p.setCpf_pessoas(rs.getInt(2));
                p.setTitulo_de_eleitor_pessoas(rs.getInt(3));
                p.setIdade_pessoas(rs.getInt(4));
                Cidade cidade = new Cidade();
                int xa = rs.getInt(5);                
                cidade = cidadeDAO.BuscarNomeCidade(xa);   
                p.setCidade(cidade);   
                pessoas.add(p);
                
                return p;
            }
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cpf não encontrado!");
            
        } return null;
    }
    
    public  List BuscarListaPessoa(String cidade) throws SQLException  {
        List <Pessoas> pessoas  = new ArrayList<>();
        int x=0;
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM `pessoas` WHERE `cidade` = '" +cidade+ "';");

            while (rs.next()){
                Pessoas p = new Pessoas();
                p.setNome_pessoas(rs.getString(1));
                p.setCpf_pessoas(rs.getInt(2));
                p.setTitulo_de_eleitor_pessoas(rs.getInt(3));
                p.setIdade_pessoas(rs.getInt(4));
                p.setId_cidade(rs.getInt(5));
                x++;
                pessoas.add(p);
                return pessoas;
            }
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cpf não encontrado!");           
        } return null;     
    }
    
    public  int BuscarTitulo(int titulo) throws SQLException  {
        
       try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;

            rs = stmt.executeQuery("Select * from pessoas where titulo_de_eleitor_pessoas = '" +titulo+ "';");
            while (rs.next()){
                Pessoas p = new Pessoas();
                p.setNome_pessoas(rs.getString(1));
                p.setCpf_pessoas(rs.getInt(2));
                p.setTitulo_de_eleitor_pessoas(rs.getInt(3));
                p.setIdade_pessoas(rs.getInt(4));
                p.setId_cidade(rs.getInt(5));
                return p.getTitulo_de_eleitor_pessoas();
            }

        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cpf não encontrado!");
            
        } return 0;
      
    }
    
    public  List ListadePessoasPorCidade(String cidade) throws SQLException  {
         List <Pessoas> pessoas  = new ArrayList<>();
            int x=0;
       try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            rs = stmt.executeQuery("   SELECT nome_pessoas, cpf_pessoas, idade_pessoas, cidade.nome_cidade from pessoas, cidade where cidade.id_cidade = (select Cidade_id_cidade from cidade where cidade.nome_cidade = '"+cidade+"');");


            while (rs.next()){
                Pessoas p = new Pessoas();
                Cidade c = new Cidade();
                p.setNome_pessoas(rs.getString(1));
                p.setCpf_pessoas(rs.getInt(2));
                p.setIdade_pessoas(rs.getInt(3));
                c.setNome_cidade(rs.getString(4));

                pessoas.add(p);
                return pessoas;
            }
  
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Dados não encontrados!");
            
        } return null;
      
    }
    
    public  Pessoas BuscarTituloPessoa(int titulo) throws SQLException  {  
        System.out.println("tiitulo entrada"+titulo);
        List <Pessoas> pessoas  = new ArrayList<>();
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;

            rs = stmt.executeQuery("Select * from `pessoas` where titulo_de_eleitor_pessoas = '" +titulo+ "';");
            while (rs.next()){
                Pessoas p = new Pessoas();
                p.setNome_pessoas(rs.getString(1));
                p.setCpf_pessoas(rs.getInt(2));
                System.out.println("cpf tela pessoas"+p.getCpf_pessoas());
                p.setTitulo_de_eleitor_pessoas(rs.getInt(3));
                p.setIdade_pessoas(rs.getInt(4));
                p.setId_cidade(rs.getInt(5));
                pessoas.add(p);
                System.out.println("tiitulo saida "+p.getTitulo_de_eleitor_pessoas());
                return p;
            }
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cpf não encontrado!");  
        } return null; 
    }
    
    public  ResultSet BuscarPessoaPorCidade(String cidade) throws SQLException  {  
        List <Pessoas> pessoas  = new ArrayList<>();
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            rs = stmt.executeQuery("SELECT nome_pessoas, cpf_pessoas, titulo_de_eleitor_pessoas, idade_pessoas, cidade.nome_cidade, estado.nome_estado from pessoas\n" +
            "inner join cidade on cidade.id_cidade = pessoas.Cidade_id_cidade\n" +
            "inner join estado on estado.id_estado = cidade.Estado_id_estado\n" +
            "where cidade.nome_cidade = '" +cidade+ "';");               
            return rs;
         
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cpf não encontrado!");  
        } return null; 
    }
    
    public  ResultSet BuscarPessoaPorEstado(String estado) throws SQLException  {  
        List <Pessoas> pessoas  = new ArrayList<>();
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            rs = stmt.executeQuery("SELECT nome_pessoas, cpf_pessoas, titulo_de_eleitor_pessoas, idade_pessoas, cidade.nome_cidade, estado.nome_estado from pessoas\n" +
            "inner join cidade on cidade.id_cidade = pessoas.Cidade_id_cidade\n" +
            "inner join estado on estado.id_estado = cidade.Estado_id_estado\n" +
            "where estado.nome_estado = '" +estado+ "';");               
            return rs;
         
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cpf não encontrado!");  
        } return null; 
    }
    
    public  ResultSet BuscarTodasPessoa() throws SQLException  {  
        List <Pessoas> pessoas  = new ArrayList<>();
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            rs = stmt.executeQuery("SELECT nome_pessoas, cpf_pessoas, titulo_de_eleitor_pessoas, idade_pessoas, cidade.nome_cidade, estado.nome_estado from pessoas\n" +
            "inner join cidade on cidade.id_cidade = pessoas.Cidade_id_cidade\n" +
            "inner join estado on estado.id_estado = cidade.Estado_id_estado;");               
            return rs;
         
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cpf não encontrado!");  
        } return null; 
    }
    
    
  
    

}
    
    

