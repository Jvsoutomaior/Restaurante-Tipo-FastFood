package model;

public class Loja {
	
	private Funcionario funcionario;
	private Venda venda;
	private ItemCardapio itemCardapio;
	
	private String nomeLoja;
	private String cnpj;
	private String telefoneLoja;
	private String endereco;
	private String horarioFuncionamento;
	
	//construtor da classe: 
	public Loja(Funcionario funcionario, Venda venda,ItemCardapio itemCardapio, String nomeLoja,String cnpj, String telefoneLoja, String endereco, 
		String horarioFuncionamento ) {
		this.funcionario = funcionario;
		this.venda = venda;
		this.itemCardapio = itemCardapio;
		
		this.nomeLoja = nomeLoja;
		this.cnpj = cnpj;
		this.telefoneLoja = telefoneLoja;
		this.endereco = endereco;
		this.horarioFuncionamento = horarioFuncionamento;
	} 

	
	//getters e setters:
	public Funcionario getFuncionario() {
		return funcionario;
	}



	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}



	public Venda getVenda() {
		return venda;
	}



	public void setVenda(Venda venda) {
		this.venda = venda;
	}



	public ItemCardapio getItemCardapio() {
		return itemCardapio;
	}



	public void setItemCardapio(ItemCardapio itemCardapio) {
		this.itemCardapio = itemCardapio;
	}



	public String getNomeLoja() {
		return nomeLoja;
	}



	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}



	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	public String getTelefoneLoja() {
		return telefoneLoja;
	}



	public void setTelefoneLoja(String telefoneLoja) {
		this.telefoneLoja = telefoneLoja;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}



	public void setHorarioFuncionamento(String horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}
}
