package model;

public class Sobremesa extends Lanche{
	
	private String sabor;

	//construtor da classe
	public Sobremesa(String sabor, String nomeLanche, String descricao) {
		super(nomeLanche, descricao);
		this.sabor = sabor;
	}

	//getters e setters
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	
}
