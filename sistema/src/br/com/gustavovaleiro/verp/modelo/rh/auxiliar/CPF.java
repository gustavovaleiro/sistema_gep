package br.com.gustavovaleiro.verp.modelo.rh.auxiliar;

import javax.persistence.Column;
import javax.persistence.Embeddable;

// fazer o uso da classe embutida aqui pro cpf e o rg
@Embeddable
public class CPF {
	
	
	@Column(name = "pessoa_fisica_CPF", length = 11)
	private String CPF;

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		int soma = 0;
		for(int i = 10, j = 0; i >= 2; i--, j++) 
			soma += Integer.parseInt(String.valueOf(cPF.charAt(j)))*i;
		int verificador1 = (soma*10)%11;	
		if(verificador1 == 10) 
			verificador1 = 0;
		
		soma = 0;
		for(int i = 11, j = 0; i >= 2; i--, j++) 
			soma += Integer.parseInt(String.valueOf(cPF.charAt(j)))*i;
		int verificador2 = (soma*10)%11;	
		if(verificador2 == 10) 
			verificador2 = 0;
		
		if(verificador1 == Integer.parseInt(String.valueOf(cPF.charAt(9))) &&
				verificador2 == Integer.parseInt(String.valueOf(cPF.charAt(10))))	
			CPF = cPF;
		else
			throw new RuntimeException("CPF INVALIDO");
	}
	
}
