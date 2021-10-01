package controle;
import javax.swing.*;

import model.Funcionario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroFuncionario implements ActionListener{
	
	private JTextField nomeDigitado;
	private JTextField cpfDigitado;
	private JTextField emailDigitado;
	private JTextField telefoneFDigitado;
	private JTextField bornDateDigitado;
	private JTextField workHourDigitado;
	private JTextField cargoDigitado;
	private JTextField salarioDigitado;
	private JTextField contractDateDigitado;

	public CadastroFuncionario(JTextField nomeDigitado, JTextField cpfDigitado, JTextField emailDigitado, JTextField telefoneFDigitado, JTextField bornDateDigitado, JTextField workHourDigitado, JTextField cargoDigitado, JTextField salarioDigitado, JTextField contractDateDigitado ) {
		setNomeDigitado(nomeDigitado);
		setCpfDigitado(cpfDigitado);
		setEmailDigitado(emailDigitado);
		setTelefoneFDigitado(telefoneFDigitado);
		setBornDateDigitado(bornDateDigitado);
		setWorkHourDigitado(workHourDigitado);
		setCargoDigitado(cargoDigitado);
		setSalarioDigitado(salarioDigitado);
		setContractDateDigitado(contractDateDigitado);
		
	}
	
	public JTextField getNomeDigitado() {
		return nomeDigitado;
	}

	public void setNomeDigitado(JTextField nomeDigitado) {
		this.nomeDigitado = nomeDigitado;
	}

	public JTextField getCpfDigitado() {
		return cpfDigitado;
	}

	public void setCpfDigitado(JTextField cpfDigitado) {
		this.cpfDigitado = cpfDigitado;
	}

	public JTextField getEmailDigitado() {
		return emailDigitado;
	}

	public void setEmailDigitado(JTextField emailDigitado) {
		this.emailDigitado = emailDigitado;
	}

	public JTextField getTelefoneFDigitado() {
		return telefoneFDigitado;
	}

	public void setTelefoneFDigitado(JTextField telefoneFDigitado) {
		this.telefoneFDigitado = telefoneFDigitado;
	}

	public JTextField getBornDateDigitado() {
		return bornDateDigitado;
	}

	public void setBornDateDigitado(JTextField bornDateDigitado) {
		this.bornDateDigitado = bornDateDigitado;
	}

	public JTextField getWorkHourDigitado() {
		return workHourDigitado;
	}

	public void setWorkHourDigitado(JTextField workHourDigitado) {
		this.workHourDigitado = workHourDigitado;
	}

	public JTextField getCargoDigitado() {
		return cargoDigitado;
	}

	public void setCargoDigitado(JTextField cargoDigitado) {
		this.cargoDigitado = cargoDigitado;
	}

	public JTextField getSalarioDigitado() {
		return salarioDigitado;
	}

	public void setSalarioDigitado(JTextField salarioDigitado) {
		this.salarioDigitado = salarioDigitado;
	}

	public JTextField getContractDateDigitado() {
		return contractDateDigitado;
	}

	public void setContractDateDigitado(JTextField contractDateDigitado) {
		this.contractDateDigitado = contractDateDigitado;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		String nome = nomeDigitado.getText();
		String cpf = nomeDigitado.getText();
		String email = nomeDigitado.getText();
		String telefoneF = nomeDigitado.getText();
		String bornDate = nomeDigitado.getText();
		String workHour = nomeDigitado.getText();
		int workHourint = Integer.parseInt(workHour);
		String cargo = nomeDigitado.getText();
		String salario = nomeDigitado.getText();
		int salarioint = Integer.parseInt(salario);
		String contractDate = nomeDigitado.getText();
		
		Funcionario novoFuncionario = new Funcionario(nome, cpf, email, telefoneF, bornDate, workHourint, cargo, salarioint, contractDate);
		
	}

}
