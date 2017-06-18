package bancoSQL;

import java.sql.*;

public class Delete {
    
    public Delete() {
        RemoveRegistros();
    }
    
    private void RemoveRegistros() {
        Statement stmt = null;
        String sql = null;
        
        try {
            // Cria uma instancia para a criacao do Banco de dados
            ConexaoMySQL conn = ConexaoMySQL.getConexao();
            try ( // Cria conexao com o banco
                    Connection c = conn.getConexaoMySQL()) {
                c.setAutoCommit(false);
                
                stmt = c.createStatement();
                sql = "DROP TABLE CLIENTES;";
                stmt.executeUpdate(sql);
                c.commit();
                
                stmt = c.createStatement();
                sql = "DROP TABLE RESERVAS;";
                stmt.executeUpdate(sql);
                c.commit();
                
                stmt = c.createStatement();
                sql = "DROP TABLE QUARTO;";
                stmt.executeUpdate(sql);
                c.commit();
                
                stmt.close();
            }
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }  
    }
    

}
