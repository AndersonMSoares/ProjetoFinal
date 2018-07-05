/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.Candidato;
import Classes.Pessoas;
import DAO.CandidatoDAO;
import DAO.PessoasDAO;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import conexao.ConnectionFactory;
import java.sql.SQLException;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author MarkVII
 */
public class IntegracaoTest {
    
    public IntegracaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
   
    
    @Ignore
    public void cadastrarPessoaTest() throws SQLException{
        ConnectionFactory c = new ConnectionFactory();
        PessoasDAO p = new PessoasDAO();
//        Random nAleatorio = new Random();
//        int cpf = nAleatorio.nextInt(100000);
//        int ti = nAleatorio.nextInt(100000);
        int cpf = 1555555511;
        int ti = 29929292;
        String nome = "TestHib";
        int idade = 25;
        int id = 1;
        ConnectionFactory.getConnection();
        c.inserirSQL("INSERT INTO pessoas (cpf_pessoas,  titulo_de_eleitor_pessoas, nome_pessoas, idade_pessoas, cidade_id_cidade) values ('"+cpf+"' ,'"+ti+"' , '"+nome+"' , '"+idade+"', '"+id+"')");
        assertEquals(cpf, p.BuscarCpf(cpf));
    }
    
    @Test
    public void cadastrarCandidatoTest() throws SQLException{
         ConnectionFactory cf = new ConnectionFactory();
         CandidatoDAO cd = new CandidatoDAO();
         int b = 1555555511;
         int c = 1;
         int d = 2;
         ConnectionFactory.getConnection();
         cf.inserirSQL("INSERT INTO candidato (pessoas_cpf_pessoas, partido_id_partido, cargo_id_cargo) values ('" + b + "', '" + d + "', '" + c + "')");
         Candidato x = cd.BuscarCpfCandidato(b);
         Pessoas p = x.getPessoas();
         assertEquals(b, p.getCpf_pessoas());
    }
    
            
            
            
}
