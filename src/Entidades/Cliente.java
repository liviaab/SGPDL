package Entidades;

import OperacoesBancoSQL.SelecaoBanco;

public class Cliente {
    
    private int id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;  
    private String telefone;
    private String email;

    public Cliente(String nome, String cpf, String dataNascimento, String endereco, String telefone,String email) {        
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void limparDados() {
        this.email = null;
        this.nome = null;
        this.id = 0;
        this.cpf = null;
        this.dataNascimento = null;
        this.endereco = null;
        this.telefone = null;
    }
    
    
}
