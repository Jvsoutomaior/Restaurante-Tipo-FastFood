package model;

public class Funcionario {
	
	private String nomeFuncionario;
	private String cpf;
	private String email;
	private String telefoneFuncionario;
	private String bornDate;
	private int workHour;
	private String cargo;
	private int salario;
	private String contractDate;	

	//construtor da classe
	public Funcionario(String nomeFuncionario, String cpf, String email, String telefoneFuncionario, String bornDate, int workHour, String cargo, int salario, String contractDate) {
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

	public String getBornDate() {
		return bornDate;
	}

	public void setBornDate(String bornDate) {
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

	public String getContractDate() {
		return contractDate;
	}

	public void setContractDate(String contractDate) {
		this.contractDate = contractDate;
	}

	
}
