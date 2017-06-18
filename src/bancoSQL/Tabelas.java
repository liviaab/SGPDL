package bancoSQL;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Tabelas {
    
    public Tabelas() {
        criarTabelaCliente();
        criarTabelaReserva();
        criarTabelaQuarto();
    }
    
    private void criarTabelaCliente() {
        
        Statement stmt = null;
        // Cria uma instancia para a criacao do Banco de dados
        ConexaoMySQL conn = ConexaoMySQL.getConexao();
        // Cria conexao com o banco
        Connection conexao = conn.getConexaoMySQL();
        
        try {
            stmt = conexao.createStatement();
            String sql = "CREATE TABLE CLIENTES " +
                        "(id_Cliente INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                        " NOME      TEXT    NOT NULL, " + 
                        " CPF     TEXT    NOT NULL, " +
                        " DATANASCIMENTO     DATE    NOT NULL, " +
                        " TELEFONE     TEXT    NOT NULL, " +
                        " EMAIL     TEXT    NOT NULL, " +
                        " ENDERECO     TEXT    NOT NULL)"; 
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }
    
    private void criarTabelaReserva() {
        
        Statement stmt = null;
        // Cria uma instancia para a criacao do Banco de dados
        ConexaoMySQL conn = ConexaoMySQL.getConexao();
        // Cria conexao com o banco
        Connection conexao = conn.getConexaoMySQL();
        
        try {
            stmt = conexao.createStatement();
            String sql = "CREATE TABLE RESERVAS " +
                        "(id_Reserva INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                        " DATAINICIAL          DATE        NOT NULL, " + 
                        " DATAFINAL        DATE        NOT NULL, " + 
                        " STATUS     TEXT        NOT NULL, " +
                        " CLIENTE     INTERGER       KEY NOT NULL, " +
                        " QUARTO     INTERGER        KEY NOT NULL, " +                    
                        " FOREIGN KEY(CLIENTE) REFERENCES CLIENTES(id_Cliente) " +                     
                        " FOREIGN KEY(QUARTO) REFERENCES QUARTO(id_Quarto));"; 
            
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }        
    }
    
    private void criarTabelaQuarto() {

        Statement stmt = null;
        // Cria uma instancia para a criacao do Banco de dados
        ConexaoMySQL conn = ConexaoMySQL.getConexao();
        // Cria conexao com o banco
        Connection conexao = conn.getConexaoMySQL();

        try {
            stmt = conexao.createStatement();
            String sql = "CREATE TABLE QUARTO " +
                        "(id_Quarto INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                        " TIPO          TEXT        KEY NOT NULL, " +
                        " DESCRICAO            TEXT        NOT NULL, " + 
                        " NUMCAMAS         TEXT        NOT NULL, " + 
                        " CAPACIDADE         INTEGER        NOT NULL, " +
                        " NUMBANHEIROS        INTERGER        NOT NULL, " +
                        " PRECO       DOUBLE     NOT NULL, " +
                        " OCUPADO       INTERGER     NOT NULL);"; 

            stmt.executeUpdate(sql);
            stmt.close();

        } catch (SQLException e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }        
    }   
}