package x;

import java.text.ParseException;
import java.text.SimpleDateFormat;


import model.Funcionario;
import model.Venda;

public class DataAuxiliar {

	
	public DataAuxiliar(String bornDate, String transactionDate)  throws ParseException{
		
	SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
	formato.parse(bornDate);
	formato.parse(transactionDate);
	}

}
