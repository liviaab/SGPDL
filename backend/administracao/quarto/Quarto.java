
package quarto;

public class Quarto{
	//attr
	private int capacidade;
	private int NumCamasSolteiro;
	private int NumCamasCasal;
	private int NumBanheiros;
	private int PrecoDiaria;


	//Construtores
	public Quarto(int capacidade, int nCamasSolteiro, int nCamasCasal, int nBanheiros, int pDiaria){
		this.capacidade = capacidade;
		this.NumCamasSolteiro = nCamasSolteiro;
		this.NumCamasCasal = nCamasCasal;
		this.NumBanheiros = nBanheiros;
		this.PrecoDiaria = pDiaria;
	}	
	
	public Quarto(){
		Quarto(0,0,0,0,0);
	}
	//get & set
	public int getCapacidade(){
		return this.capacidade;
	}	
	public void setCapacidade(int c){
		this.capacidade = c;
	}

	public int getNumCamasSolteiro(){
		return this.NumCamasSolteiro ;	
	}
	public void setNumCamasSolteiro (int n){
		this.NumCamasSolteiro = n;
	}

	public int getNumCamasCasal(){
		return this.NumCamasCasal ;	
	}
	public void setNumCamasCasal (int n){
		this.NumCamasCasal = n;
	}

	public int getNumBanheiros(){
		return this.NumBanheiros ;	
	}
	public void setNumBanheiros (int n){
		this.NumBanheiros = n;
	}

	public int getPrecoDiaria(){
		return this.PrecoDiaria;	
	}
	public void setPrecoDiaria(int p){
		this.PrecoDiaria = p;
	}

	

	//Metodos

	/*
	RemoverQuarto()
		
	*/
}
