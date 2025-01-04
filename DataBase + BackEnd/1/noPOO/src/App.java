import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.Statement;

import java.util.Scanner;

public class App {
    static Connection conexao = null;

    static public void criarConexao(){
        // Parametros de conexao com o banco de dados, 
        // trocar teste para o nome do banco de dados que eu criei
        String url = "jdbc:mysql://localhost:3306/teste";
        String usuario = "root";
        String senha = "12345";

        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }  

    static public void consultar(int id){
        executarConsulta(id);
    }

    static public void consultar(){
        executarConsulta(-1);
    }

    static public void executarConsulta(int id){
        String sql;

        if(id <= 0){
            sql = "SELECT * FROM pessoa";
        }
        else{
            sql = "SELECT * FROM pessoa WHERE id = ?";
        }
        
        try (PreparedStatement comando = conexao.PreparedStatement(sql)){
            if(id > 0){
                comando.setInt(1, id);
            }

            // Executar a consulta e obter oss resultados
            try (PreparedStatement resultado = conexao.executeQuery();){
                while(resultado.next()) {
                    id = resultado.getInt("id");
                    String nome =  resultado.getString("nome");
                    String telefone = resultado.getString("telefone");

                    System.out.println("ID: " + id + ",Nome: " + nome + ", Telefone: " + telefone);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void atualizar(int id, String novoNome, String novoTelefone){
        String sql = "UPDATE pessoa SET nome = ?, telefone = ? WHERE id = ?";

        try (PreparedStatement comando = conexao.prepareStatement(sql)){
            comando.setString(1, novoNome);
            comando.setString(2, novoTelefone);
            comando.setString(3, id);

            comando.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletar(int id){
        String sql = "DELETE FROM pessoa WHERE id = ?";

        try (PreparedStatement comando = conexao.prepareStatement(sql)){
            comando.setInt(1, id);

            comando.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inserir(String nome, String telefone){
        Strin sql = "INSERT INTO pessoa(nome, telefone) values (?, ?)";

        try (PreparedStatement comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            comando.setString(1, nome);
            comando.setString(2, telefone);

            comando.executeUpdate();

            try (PreparedStatement resultado = comando.getGeneratedKeys()){
                if(resultado.next()){
                    System.out.println("ID do usuario recem inserido" + resultado.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        
        criarConexao();
        //deletar(12);
        //inserir("Carla", "589321745289");
        
        executarConsulta(7);
        
        if(conexao != null)
        try {
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        input.close();
    }
}
