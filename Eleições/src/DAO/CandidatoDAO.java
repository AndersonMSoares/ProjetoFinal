
package DAO;

import Classes.Candidato;
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

public class CandidatoDAO {

    ConnectionFactory conexao= new ConnectionFactory();
    PessoasDAO pessoasDAO = new PessoasDAO();
    
        
    public  Candidato BuscarCpfCandidato(int cpf) throws SQLException  {  
        System.out.println("cpf"+cpf);
        List <Candidato> candidato  = new ArrayList<>();
        PessoasDAO pessoasDAO = new PessoasDAO();
        
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
            System.out.println("cpf------"+cpf);
            ResultSet rs;

            rs = stmt.executeQuery("Select * from candidato where pessoas_cpf_pessoas = '" +cpf+ "';");
            System.out.println("cpf********"+cpf);
            while (rs.next()){
                Candidato candidatos = new Candidato();
                candidatos.setCpf_pessoas(rs.getInt(1));
                candidatos.setPartido_candidato(rs.getString(2));
                candidatos.setCargo_candidato(rs.getString(3));
                Pessoas pessoas = new Pessoas();             
                pessoas = pessoasDAO.BuscarCpfPessoa(cpf);
                candidatos.setPessoas(pessoas);
                candidato.add(candidatos);

                return candidatos;
            }
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cpf não encontrado!");  
        } catch(NullPointerException ex){
                 JOptionPane.showMessageDialog(null,  "cpf nao encontrado");
        }
return null; 
    }
    
    public  ResultSet BuscarTodosCandidatos() throws SQLException  {  
        List <Candidato> candidato   = new ArrayList<>();
        
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            rs = stmt.executeQuery("SELECT nome_pessoas, cpf_pessoas, titulo_de_eleitor_pessoas, idade_pessoas, cidade.nome_cidade, estado.nome_estado, partido.nome_partido, cargo.nome_cargo from pessoas\n" +
            "inner join candidato on candidato.Pessoas_cpf_pessoas = pessoas.cpf_pessoas\n" +
            "inner join partido on partido.id_partido = candidato.Partido_id_partido\n" +
            "INNER JOIN cargo on cargo.id_cargo = candidato.Cargo_id_cargo\n" +
            "inner join cidade on cidade.id_cidade = pessoas.Cidade_id_cidade\n" +
            "inner join estado on estado.id_estado = cidade.Estado_id_estado;");               
            return rs;
         
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cpf não encontrado!");  
        } return null; 
    }
    
    
     public  ResultSet BuscarCandidatoPorEstado(String estado) throws SQLException  {  
        List <Candidato> Candidato  = new ArrayList<>();
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            rs = stmt.executeQuery("SELECT nome_pessoas, cpf_pessoas, titulo_de_eleitor_pessoas, idade_pessoas, cidade.nome_cidade, "
            + "estado.nome_estado, partido.nome_partido, cargo.nome_cargo from pessoas\n" +
            "inner join candidato on candidato.Pessoas_cpf_pessoas = pessoas.cpf_pessoas\n" +
            "inner join partido on partido.id_partido = candidato.Partido_id_partido\n" +
            "INNER JOIN cargo on cargo.id_cargo = candidato.Cargo_id_cargo\n" +
            "inner join cidade on cidade.id_cidade = pessoas.Cidade_id_cidade\n" +
            "inner join estado on estado.id_estado = cidade.Estado_id_estado\n" +
            "where estado.nome_estado = '" +estado+ "';");         
            return rs;
         
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Candidatos não encontrados!");  
        } return null; 
    }
     
     public  ResultSet BuscarCandidatosPorCidade(String cidade) throws SQLException  {  
        List <Candidato> candidato  = new ArrayList<>();
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;
            rs = stmt.executeQuery("SELECT nome_pessoas, cpf_pessoas, titulo_de_eleitor_pessoas, idade_pessoas, cidade.nome_cidade, "
             + "estado.nome_estado, partido.nome_partido, cargo.nome_cargo from pessoas\n" +
            "inner join candidato on candidato.Pessoas_cpf_pessoas = pessoas.cpf_pessoas\n" +
            "inner join partido on partido.id_partido = candidato.Partido_id_partido\n" +
            "INNER JOIN cargo on cargo.id_cargo = candidato.Cargo_id_cargo\n" +
            "inner join cidade on cidade.id_cidade = pessoas.Cidade_id_cidade\n" +
            "inner join estado on estado.id_estado = cidade.Estado_id_estado\n" +
            "where cidade.nome_cidade = '" +cidade+ "';");                     
            return rs;
         
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cidade não encontrada!");  
        } return null; 
    }
     
     public List BuscarTodosCandidatosList() {
        List <Candidato> candidato = new ArrayList<>();
        int x=0;
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT nome_pessoas, cpf_pessoas, titulo_de_eleitor_pessoas, idade_pessoas, cidade.nome_cidade, estado.nome_estado, partido.nome_partido, cargo.nome_cargo from pessoas\\n\" +\n" +
"            \"inner join candidato on candidato.Pessoas_cpf_pessoas = pessoas.cpf_pessoas\\n\" +\n" +
"            \"inner join partido on partido.id_partido = candidato.Partido_id_partido\\n\" +\n" +
"            \"INNER JOIN cargo on cargo.id_cargo = candidato.Cargo_id_cargo\\n\" +\n" +
"            \"inner join cidade on cidade.id_cidade = pessoas.Cidade_id_cidade\\n\" +\n" +
"            \"inner join estado on estado.id_estado = cidade.Estado_id_estado;  ;");
            while (rs.next()){
                Candidato c = new Candidato();
                c.setNome_pessoas(rs.getString(1));
                c.setCpf_pessoas(rs.getInt(2));
                c.setTitulo_de_eleitor_pessoas(rs.getInt(3));
                c.setIdade_pessoas(rs.getInt(4));
                c.setNome_cidade(rs.getString(5));
                c.setNome_estado(rs.getString(6));
                c.setPartido_candidato(rs.getString(7));
                c.setCargo_candidato(rs.getString(8));

                candidato.add(c);
                x++;
            }     
            return candidato;   
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Estado não encontrado!");
        } return null;
    }
   
}

