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
public class Quarto {
    
    private int id;
    private String tipo;
    private String descricao;
    private int numCamas = 0;
    private int capacidade = 0;
    private int numBanheiros = 0;
    private double preco = 0;
    private int ocupado = 0;
    
    public Quarto(int id, String tipo, String descricao, int numCamas, int capacidade, int numBanheiros, double preco, int ocupado) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.numCamas = numCamas;
        this.capacidade = capacidade;
        this.numBanheiros = numBanheiros;
        this.preco = preco;
        this.ocupado = ocupado;      
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getNumBanheiros() {
        return numBanheiros;
    }

    public double getPreco() {
        return preco;
    }

    public int getOcupado() {
        return ocupado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setNumBanheiros(int numBanheiros) {
        this.numBanheiros = numBanheiros;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setOcupado(int ocupado) {
        this.ocupado = ocupado;
    }     
}
