package controle;
import model.Funcionario;

import java.util.List;
import java.util.ArrayList;

public class ControleFuncionario {
	
	private List<Funcionario> listafuncionarios;
	
	
	public ControleFuncionario(List<Funcionario> listafuncionarios) {

		setListafuncionarios(new ArrayList<Funcionario>());
	
	}

	public List<Funcionario> getListafuncionarios() {
		return listafuncionarios;
	}


	public void setListafuncionarios(List<Funcionario> listafuncionarios) {
		this.listafuncionarios = listafuncionarios;
	}
}
