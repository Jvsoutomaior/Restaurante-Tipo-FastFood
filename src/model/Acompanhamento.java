package model;

public class Acompanhamento extends Lanche {
	
	private char tamanhoAcompanhamento;
	
	//construtor da classe
	public Acompanhamento(char tamanhoAcompanhamento, String nomeLanche, String descricao) {
		super(nomeLanche, descricao);
		this.tamanhoAcompanhamento = tamanhoAcompanhamento;
		
	}
	
	//getters e setters
	public char getTamanhoAcompanhamento() {
		return tamanhoAcompanhamento;
	}

	public void setTamanhoAcompanhamento(char tamanhoAcompanhamento) {
		this.tamanhoAcompanhamento = tamanhoAcompanhamento;
	}

}
