package OperacoesBancoSQL;

import Entidades.Cliente;
import Entidades.Quarto;
import Entidades.Reserva;
import bancoSQL.ConexaoMySQL;
import java.sql.*;

public class InsercaoBanco {

    public InsercaoBanco() {

    }

    public void inserirCliente(Cliente cliente) {

        try {
            // Cria uma instancia para a criacao do Banco de dados
            ConexaoMySQL conn = ConexaoMySQL.getConexao();
            // Cria conexao com o banco
            Connection c = conn.getConexaoMySQL();

            String sql = "INSERT INTO CLIENTES (id_Cliente,NOME, CPF, DATANASCIMENTO, ENDERECO, TELEFONE, EMAIL) "
                    + "VALUES (?,?,?,?,?,?,?);";

            try (PreparedStatement stmt = c.prepareStatement(sql)) {
                stmt.setString(1, null);
                stmt.setString(2, cliente.getNome());
                stmt.setString(3, cliente.getCpf());
                stmt.setString(4, cliente.getDataNascimento());
                stmt.setString(5, cliente.getEndereco());
                stmt.setString(6, cliente.getTelefone());
                stmt.setString(7, cliente.getEmail());
                stmt.execute();
            }

        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    
    public void inserirReserva(Reserva reserva, int IdCliente, int idQuarto) {

        try {
            // Cria uma instancia para a criacao do Banco de dados
            ConexaoMySQL conn = ConexaoMySQL.getConexao();
            // Cria conexao com o banco
            Connection c = conn.getConexaoMySQL();

            String sql = "INSERT INTO RESERVAS (id_Cliente, DATAINICIAL, DATAFINAL, STATUS, CLIENTE,  QUARTO) "
                    + "VALUES (?,?,?,?,?,?);";

            try (PreparedStatement stmt = c.prepareStatement(sql)) {
                stmt.setString(1, null);
                stmt.setString(2, reserva.getDataIncial());
                stmt.setString(3, reserva.getDataFinal());
                stmt.setString(4, reserva.getStatus());                
                stmt.setInt(5, IdCliente);
                stmt.setInt(6, idQuarto);
                stmt.execute();
            }

        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);

        }
    }
    
    public void inserirQuarto(Quarto quarto) {

        try {
            // Cria uma instancia para a criacao do Banco de dados
            ConexaoMySQL conn = ConexaoMySQL.getConexao();
            // Cria conexao com o banco
            Connection c = conn.getConexaoMySQL();

            String sql = "INSERT INTO RESERVAS (id_Quarto, TIPO , DESCRICAO, NUMCAMAS, CAPACIDADE,  NUMBANHEIROS, PRECO, OCUPADO) "
                    + "VALUES (?,?,?,?,?,?,?,?);";

            try (PreparedStatement stmt = c.prepareStatement(sql)) {
                stmt.setString(1, null);
                stmt.setString(2, quarto.getTipo());
                stmt.setString(3, quarto.getDescricao());
                stmt.setInt(4, quarto.getNumCamas());  
                stmt.setInt(5, quarto.getCapacidade());                
                stmt.setInt(6, quarto.getNumBanheiros());                
                stmt.setDouble(7, quarto.getPreco());                
                stmt.setInt(8, quarto.getOcupado());                
                stmt.execute();
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}