package conexao;



import Classes.Candidato;
import Classes.Cargo;
import Classes.Cidade;
import Classes.Estado;
import Classes.Partido;
import Classes.Pessoas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConnectionFactory {  
    
    public static String status = "Não conectou...";
    static Statement statement = null;
    static Connection connection = getConnection();
    public ConnectionFactory(){
        
    }
 
  
 
    public static java.sql.Connection getConnection(){
        
	Connection connection = null;          //atributo do tipo Connection
        try {
            // Carregando o JDBC Driver padrão
            String driverName = "com.mysql.jdbc.Driver";                        
            Class.forName(driverName);

            // Configurando a nossa conexão com um banco de dados//

            String serverName = "127.0.0.1";    //caminho do servidor do BD
            String mydatabase ="eleicao";        //nome do seu banco de dados
            String url =  "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";        //nome de um usuário de seu BD      
            String password = "";      //sua senha de acesso
            connection = DriverManager.getConnection(url, username, password);
            //Testa sua conexão//  
            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
                //System.out.println(""+status);
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
                System.out.println(""+status);
            }
            return connection;
        }catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
}
    
// método que retorna o status da conexao
    public static String statusConnection(){
        return status;
    }
    
// método que fecha a conexao
    public static boolean fecharConexao(){
        try{
            ConnectionFactory.getConnection().close();
            return true;
        } catch (SQLException e){
            return false;
        }
    }
        
    // Métado que reinicia a conexao
    public static java.sql.Connection ReiniciarConexao(){
        fecharConexao();
        return ConnectionFactory.getConnection();
    }
        
    public  boolean inserirSQL(String sql) throws SQLException{
        boolean boolIns = false;
            Connection connection = getConnection();
            Statement stmt = (Statement) connection.createStatement();
            boolIns = stmt.execute(sql);
            fecharConexao();
            return boolIns;

    } 
    
     public  boolean Excluir(String sql) throws SQLException{
        boolean boolIns = false;
            Connection connection = getConnection();
            Statement stmt = (Statement) connection.createStatement();
            boolIns = stmt.execute(sql);
            fecharConexao();
            return boolIns;
       
    } 
    
     public  boolean Alterar(String sql) throws SQLException{
        boolean boolIns = false;
        try{
            Connection connection = getConnection();
            Statement stmt = (Statement) connection.createStatement();
            boolIns = stmt.execute(sql);
            fecharConexao();
            return boolIns;
        }catch (SQLException erro){
            System.out.println("Erro de SQL " +erro);
        }
        fecharConexao();
        return boolIns;
    } 
     
    public  int updateSQL(String sql){
		int intUpd = 0;
		try{
			Connection connection = getConnection();
                        Statement stmt = (Statement) connection.createStatement();
			intUpd =stmt.executeUpdate(sql);
                        return intUpd;
		}
		catch(SQLException erro){
			System.out.println("Erro ao Atualizar! "+erro);
		}
		fecharConexao();
                return intUpd;
	}
}