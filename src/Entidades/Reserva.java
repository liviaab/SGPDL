/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Fernanda
 */
public class Reserva {
    
    private int id;
    private String dataIncial;
    private String dataFinal;
    private String status;
    private Cliente cliente;
    private Quarto quarto;
    
    public Reserva(int id, String dataIncial, String dataFinal, String status, Cliente cliente, Quarto quarto) {
        this.id = id;
        this.dataIncial = dataIncial;
        this.dataFinal = dataFinal;
        this.status = status;
        this.cliente = cliente;
        this.quarto = quarto;    
    }

    public int getId() {
        return id;
    }

    public String getDataIncial() {
        return dataIncial;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public String getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataIncial(String dataIncial) {
        this.dataIncial = dataIncial;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }            
}
