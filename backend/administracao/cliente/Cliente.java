package cliente;

public class Cliente{
	//attr
	private long int cpf;
	private long int telefone;
	private String nome;
	private String email;
	
	//Construtores
	public Cliente(){
		Cliente (0,0,"", "");
	}

	public Cliente(long int cpf, long int telefone, String nome, String email){
		this.cpf = cpf;
		this.telefone  = telefone;
		this.nome = nome;
		this.email = email;
	}

	//get & set
	public long int getCpf(){
		return this.cpf;	
	}	
	public void setCpf(long int cpf){
		this.cpf = cpf;
	}

	public long int getTelefone(){
		return this.telefone;	
	}	
	public void setTelefone(long int t){
		this.telefone = t;
	}

	public String getNome(){
		return this.nome;	
	}
	public void setNome(String n){
		this.nome = n;
	}

	public String getEmail(){
		return this.email;	
	}
	public void setEmail(String e){
		this.email = e;
	}

	//Metodos 
}
