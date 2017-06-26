package OperacoesBancoSQL;

import bancoSQL.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelecaoBanco {
    
    private boolean retorno = false;

    public SelecaoBanco() {

    }
    
    public ResultSet selecionarClientes() {
        try {
            // Cria uma instancia para a criacao do Banco de dados
            ConexaoMySQL conn = ConexaoMySQL.getConexao();
            // Cria conexao com o banco
            Connection c = conn.getConexaoMySQL();
            
            String sqlQuery = "SELECT * FROM CLIENTES ORDER BY 1;";
            
            try {                
                Statement stmt = c.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery(sqlQuery);
                return rs;            
            }catch (SQLException e) {
               System.out.println("Erro durante a execução da consulta" + e);
            }
            
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        
        return null;
    }
    
    public ResultSet selecionarQuartos() {
        try {
            // Cria uma instancia para a criacao do Banco de dados
            ConexaoMySQL conn = ConexaoMySQL.getConexao();
            // Cria conexao com o banco
            Connection c = conn.getConexaoMySQL();
            
            String sqlQuery = "SELECT * FROM QUARTO ORDER BY 1;";
            
            try {                
                Statement stmt = c.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery(sqlQuery);
                return rs;            
            }catch (SQLException e) {
               System.out.println("Erro durante a execução da consulta" + e);
            }
        
        }catch(Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return null;
    }

}
