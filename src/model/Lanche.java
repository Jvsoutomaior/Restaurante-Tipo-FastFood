package model;

public abstract class Lanche {
	
	private String nomeLanche;
	private String descricao;
	
	//construtor da classe
	public Lanche(String nomeLanche, String descricao) {
		this.nomeLanche = nomeLanche;
		this.descricao = descricao;
	
	}
	//getters e setters
	public String getNomeLanche() {
		return nomeLanche;
	}

	public void setNomeLanche(String nomeLanche) {
		this.nomeLanche = nomeLanche;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
