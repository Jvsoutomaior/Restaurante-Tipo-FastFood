package x;
import java.util.Scanner;
import model.Funcionario;


import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class ControleFuncionario {
	
	Scanner input = new Scanner(System.in);
	
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>(); //criando a arraylist de Funcionario 
	

	public void cadastrarFuncionario(String nomeFuncionario, String cpf, String email, String telefoneFuncionario, String bornDate, int workHour, String cargo, int salario, String contractDate) {
		System.out.println("Nome do Funcionario:");
		String nome = input.nextLine();
		input.next();
		
		System.out.println("CPF (apenas numeros):");
		String cpfa = input.next();
		
		System.out.println("email:");
		String emaila = input.next();
		
		System.out.println("Telefone:");
		String telefone = input.next();
		
		System.out.println("Data de Nascimento: (formato dd/mm/aaaa)");
		String data = input.next();
		
		System.out.println("Carga horaria");
		int carga = input.nextInt();
		input.next();
		
		System.out.println("Cargo:");
		String cargoa = input.next();
		
		System.out.println("Salario:");
		int salarioa = input.nextInt();
		
		System.out.println("Data de contratação: (formato dd/mm/aaaa)");
		String dataa = input.next();
		
		Funcionario funcionario = new Funcionario(nome, cpfa, emaila, telefone, data, carga, cargoa, salarioa, dataa);
		
		funcionarios.add(funcionario);
	
	}
}
