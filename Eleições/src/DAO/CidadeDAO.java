/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Candidato;
import Classes.Cidade;
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

/**
 *
 * @author Mozãooooo
 */
public class CidadeDAO {
    
    ConnectionFactory conexao= new ConnectionFactory();
    EstadoDAO estadoDao = new EstadoDAO();
    
    
    
    public  List BuscarTodasAsCidades()   {
        List <Cidade> cidades = new ArrayList<>();
        int x=0;
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("Select `id_cidade`, `nome_cidade`, `qtde_habitantes_cidade`, `Estado_id_estado` from cidade;");
            while (rs.next()){
                Cidade c = new Cidade();
                c.setId_cidade(rs.getInt(1));  
                c.setNome_cidade(rs.getString(2));
                c.setId_estado(rs.getInt(3));
                c.setQtde_habitantes_cidade(rs.getInt(4));
                cidades.add(c);
                x++;
            }
            return cidades;
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Cidade não encontrado!");

        } return null;
    }
    
    public  List BuscarTodasAsCidades(int z)   {
        List <Cidade> cidades = new ArrayList<>();
        int x=0;
                        System.out.println(""+z);

        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("Select `id_cidade`, `nome_cidade`, `qtde_habitantes_cidade`, `Estado_id_estado` from cidade where `id_cidade` = z ;");
            while (rs.next()){
                Cidade c = new Cidade();
                c.setId_cidade(rs.getInt(1));         
                c.setNome_cidade(rs.getString(2));
                c.setId_estado(rs.getInt(3));
                c.setQtde_habitantes_cidade(rs.getInt(4));
                cidades.add(c);
                
                x++;
            }
            return cidades;
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Cidade não encontrado!");

        } return null;
    }
    
    public  int BuscarIdCidade(String cidade) throws SQLException  {
        
       try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;

            rs = stmt.executeQuery("Select * from cidade where nome_cidade = '" +cidade+ "';");
            while (rs.next()){
                Cidade c = new Cidade();
                c.setId_cidade(rs.getInt(1));
                c.setNome_cidade(rs.getString(2));
                c.setId_estado(rs.getInt(3));
                c.setQtde_habitantes_cidade(rs.getInt(4));
                return c.getId_cidade();
            } 
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cidade não encontrado!");
            
        } return 0;
    }
    
    public  Cidade BuscarNomeCidade(int cidade) throws SQLException  {
      
       List <Cidade> cidades = new ArrayList<>();
       try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
          
            ResultSet rs;

            rs = stmt.executeQuery("Select * from cidade where id_cidade = '" +cidade+ "';");
            while (rs.next()){
                Cidade c = new Cidade();
                c.setId_cidade(rs.getInt(1));
                 System.out.println("id cidade:"+c.getId_cidade());
                c.setNome_cidade(rs.getString(2));
                c.setQtde_habitantes_cidade(rs.getInt(3));
                
                Estado estado = new Estado();
                int xa = rs.getInt(4);
                
                estado = estadoDao.BuscarNomeEstado(xa);
                c.setEstado(estado);                  
                cidades.add(c);
                
                return c;
            } 
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Cidade não encontrado!");
            
        } return null;
    }
    
    public  ResultSet BuscarCandidatosPorCidade(String cidade) throws SQLException  {
        List <Candidato> candidato= new ArrayList<>();
        int x=0;
        try{
            Connection connection = getConnection(); 
            Statement stmt = (Statement) connection.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT pessoas.nome_pessoas, pessoas.cpf_pessoas, pessoas.idade_pessoas from pessoas;");
               
            
            return rs;
            
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Cidade não encontrada!");

        } return null;
    }
    

    
}
