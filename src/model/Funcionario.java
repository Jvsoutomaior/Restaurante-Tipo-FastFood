package model;
import java.util.Date;

public class Funcionario {
	
	private String nomeFuncionario;
	private String cpf;
	private String email;
	private String telefoneFuncionario;
	private Date bornDate;
	private int workHour;
	private String cargo;
	private int salario;
	private Date contractDate;

	//construtor da classe
	public Funcionario(String nomeFuncionario, String cpf, String email, String telefoneFuncionario, Date bornDate, int workHour, String cargo, int salario, Date contractDate) {
		this.nomeFuncionario = nomeFuncionario;
		this.cpf = cpf;
		this.email = email;
		this.telefoneFuncionario = telefoneFuncionario;
		this.bornDate = bornDate;
		this.workHour = workHour;
		this.cargo = cargo;
		this.salario = salario;
		this.contractDate = contractDate;
	}

	//getters e setters:
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneFuncionario() {
		return telefoneFuncionario;
	}

	public void setTelefoneFuncionario(String telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public int getWorkHour() {
		return workHour;
	}

	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Date getContractDate() {
		return contractDate;
	}

	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}

	
}
