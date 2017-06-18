/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acao;

import Entidades.Cliente;
import OperacoesBancoSQL.InsercaoBanco;

/**
 *
 * @author Fernanda
 */
public class TelaCadastroHospede {
    
    public void receberDados(String nome, String endereco, String email, String cpf, String telefone, String dataNascimento){
        
        Cliente cliente = new Cliente(nome, cpf, dataNascimento, endereco, telefone, email);         

        // Insere no banco
        InsercaoBanco insere = new InsercaoBanco();
        insere.inserirCliente(cliente);
    }
    
}
