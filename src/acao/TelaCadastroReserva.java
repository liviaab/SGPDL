/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acao;

import Entidades.*;
import OperacoesBancoSQL.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Tarsila
 */
public class TelaCadastroReserva {
    
    
    public void receberDados( String dataInicial, String dataFinal, String status, Cliente cliente, Quarto quarto) {
        Reserva reserva = new Reserva(dataInicial, dataFinal, status, cliente, quarto);

        //Insere no banco
        InsercaoBanco insere = new InsercaoBanco();
        insere.inserirReserva(reserva, cliente.getId(), quarto.getId());   
    }

    public DefaultListModel receberListaQuartos(){
        DefaultListModel<String> model = new DefaultListModel();
        SelecaoBanco selecao = new SelecaoBanco();
        ResultSet rsQuartos = selecao.selecionarQuartos();
        try{

            while(rsQuartos.next()){
                String descr = rsQuartos.getString("DESCRICAO");
                model.addElement(descr);
                //System.out.println(descr);
            }

        }catch(SQLException e){
            System.out.println("Erro receberListaQuartos: " + e.getMessage());
        }

        return model;
    }

    public DefaultListModel receberListaClientes(){ 
        DefaultListModel<String> model = new DefaultListModel();
        SelecaoBanco selecao = new SelecaoBanco();
        ResultSet rsClientes = selecao.selecionarClientes();

        try{
            while(rsClientes.next()){
                String nome = rsClientes.getString("NOME");
                model.addElement(nome);
                //System.out.println(nome);
            }
        }catch(SQLException e){
            System.out.println("Erro receberListaClientes: " + e.getMessage());
        }

        return model;
    }
    
    public ResultSet receberRSQuartos(){
        SelecaoBanco selecao = new SelecaoBanco();
        return selecao.selecionarQuartos();
    }
    
    public ResultSet receberRSClientes(){
        SelecaoBanco selecao = new SelecaoBanco();
        return selecao.selecionarClientes();
    }
}
