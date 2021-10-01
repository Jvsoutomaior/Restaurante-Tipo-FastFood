package vision;

import javax.swing.*;

import controle.CadastroFuncionario;

public class CadastarNovoFuncionarioVision {

	public CadastarNovoFuncionarioVision() {
		JFrame janelaPrincipal = new JFrame("Cadastro de Funcionario");
		janelaPrincipal.setSize(400,500);
		janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaPrincipal.setVisible(true);
			
		JPanel painel = new JPanel();

		JLabel texto1 = new JLabel("Nome:");
		JTextField inserirTexto1 = new JTextField(10);
		
		JLabel texto2 = new JLabel("CPF:");
		JTextField inserirTexto2 = new JTextField(10);
		
		JLabel texto3 = new JLabel("email:");
		JTextField inserirTexto3 = new JTextField(10);
		
		JLabel texto4 = new JLabel("Telefone");
		JTextField inserirTexto4 = new JTextField(10);
		
		JLabel texto5 = new JLabel("Nome:");
		JTextField inserirTexto5 = new JTextField(10);
		
		JLabel texto6 = new JLabel("Nome:");
		JTextField inserirTexto6 = new JTextField(10);
		
		JLabel texto7 = new JLabel("Nome:");
		JTextField inserirTexto7 = new JTextField(10);

		JLabel texto8 = new JLabel("Nome:");
		JTextField inserirTexto8 = new JTextField(10);

		JLabel texto9 = new JLabel("Nome:");
		JTextField inserirTexto9 = new JTextField(10);
		
		JButton butao = new JButton();
		CadastroFuncionario clicar = new CadastroFuncionario(inserirTexto1, inserirTexto2, inserirTexto3, inserirTexto4, inserirTexto5, inserirTexto6, inserirTexto7, inserirTexto8, inserirTexto9);
		butao.addActionListener(clicar);
		
		painel.add(texto1);
		painel.add(inserirTexto1);
		
		painel.add(texto2);
		painel.add(inserirTexto2);
		
		painel.add(texto3);
		painel.add(inserirTexto3);
		
		painel.add(texto4);
		painel.add(inserirTexto4);
		
		painel.add(texto5);
		painel.add(inserirTexto5);
		
		painel.add(texto6);
		painel.add(inserirTexto6);
		
		painel.add(texto7);
		painel.add(inserirTexto7);
		
		painel.add(texto8);
		painel.add(inserirTexto8);
		
		painel.add(texto9);
		painel.add(inserirTexto9);
		
		painel.add(butao);
		
		

		janelaPrincipal.add(painel);
	}

}
