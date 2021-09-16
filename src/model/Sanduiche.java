package model;

public class Sanduiche extends Lanche {
	
	private char tamanhoSanduiche;
	private String pontoCarne;
	

	public Sanduiche(char tamanhoSanduiche, String pontoCarne, String nomeLanche, String descricao) {
		super(nomeLanche, descricao);
		this.tamanhoSanduiche = tamanhoSanduiche;
		this.pontoCarne = pontoCarne;
	}

	//getters e setters:
	public char getTamanhoSanduiche() {
		return tamanhoSanduiche;
	}


	public void setTamanhoCarne(char tamanhoSanduiche) {
		this.tamanhoSanduiche = tamanhoSanduiche;
	}


	public String getPontoCarne() {
		return pontoCarne;
	}


	public void setPontoCarne(String pontoCarne) {
		this.pontoCarne = pontoCarne;
	}

	
}
