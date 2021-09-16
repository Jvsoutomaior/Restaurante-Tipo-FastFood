package model;
import java.util.Date;

public class Venda {
	
	private ItemCardapio itemCardapio;
	
	private char id;
	private Date transactionDate;
	private int valorTotal;
	private String formaPagamento;

	//construtor da classe:
	public Venda(char id, Date transactionDate, int valorTotal, String formaPagamento) {
		this.id = id;
		this.transactionDate = transactionDate;
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPagamento;
		
	}

	//getters e setters:
	public ItemCardapio getItemCardapio() {
		return itemCardapio;
	}

	public void setItemCardapio(ItemCardapio itemCardapio) {
		this.itemCardapio = itemCardapio;
	}

	public char getId() {
		return id;
	}

	public void setId(char id) {
		this.id = id;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	

}
