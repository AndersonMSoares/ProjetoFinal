/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Classes.Candidato;
import Classes.Voto;
import conexao.ConnectionFactory;
import static conexao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mozãooooo
 */
public class VotoDAO {
    
    ConnectionFactory conexao= new ConnectionFactory();
    CandidatoDAO candidatoDAO = new CandidatoDAO();
    
    public ResultSet BuscarTodosVotos( )   {
        List <Voto> can = new ArrayList<>();
        int x=0;
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
            ResultSet rs;
           rs = stmt.executeQuery("SELECT count(voto.Candidato_Pessoas_cpf_pessoas), nome_pessoas from pessoas\n" +
            "INNER join voto on voto.Candidato_Pessoas_cpf_pessoas = pessoas.cpf_pessoas\n" +
            "\n" +
             "group by voto.Candidato_Pessoas_cpf_pessoas;");
            
            return rs;
  
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Votos não encontrados!");

        } return null;
    }
}
