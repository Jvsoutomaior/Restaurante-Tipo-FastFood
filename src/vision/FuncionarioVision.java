package vision;

import javax.swing.*;

import model.Funcionario;
import controle.ControleFuncionario;

public class FuncionarioVision {
	
	private JList<Funcionario> listaSwing;

	public FuncionarioVision() {
		JFrame janelaPrincipal = new JFrame("Restaurante Fast-Food!");
		janelaPrincipal.setSize(400,500);
		janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaPrincipal.setVisible(true);
		
		JPanel painel = new JPanel();
		
		JList<Funcionario> listaSwing = new JList<Funcionario>();
		
		JButton botaoLoja = new JButton();
		botaoLoja.setText("Cadastrar Novo Funcionario:");
		botaoLoja.setBounds(130, 100, 100, 40);
		

		painel.add(botaoLoja);
		janelaPrincipal.add(painel);
	}

}
