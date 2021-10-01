package vision;

import javax.swing.*;

public class VisionMain {
	
	private JFrame janelaPrincipal;

	public VisionMain() {
		JFrame janelaPrincipal = new JFrame("Restaurante Fast-Food!");
		janelaPrincipal.setSize(400,500);
		janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaPrincipal.setVisible(true);
		
		JPanel painel = new JPanel();
		
		JButton botaoLoja = new JButton();
		botaoLoja.setText("Loja:");
		botaoLoja.setBounds(130, 100, 100, 40);
		
		JButton botaoFuncionario = new JButton();
		botaoFuncionario.setText("Funcionario");
		botaoFuncionario.setBounds(130, 200, 110, 40);
		
		JButton botaoVendas = new JButton();
		botaoVendas.setText("Vendas:");
		botaoVendas.setBounds(130, 300, 100, 40);
		

		painel.add(botaoLoja);
		painel.add(botaoFuncionario);
		painel.add(botaoVendas);
		janelaPrincipal.add(painel);
	}

}
