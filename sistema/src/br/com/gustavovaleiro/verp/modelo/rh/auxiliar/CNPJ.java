package br.com.gustavovaleiro.verp.modelo.rh.auxiliar;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CNPJ {
	
	@Column(name="pessoa_juridica_CNPJ", length = 14 )
	private String CNPJ;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		int intCNPJ[] = new int[14];
		int soma = 0, verificador1, i,j;
		for( i = 0; i < 14; i++) 
			intCNPJ[i] = Integer.parseInt(String.valueOf(cNPJ.charAt(i)));	
		
		for( i = 0, j = 5; i < 4; i++, j--)
			soma += intCNPJ[i]*j;
		for(j = 9; i < 12; i++, j--)
			soma += intCNPJ[i]*j;
		verificador1 = soma%11;
		if(verificador1 < 2)
			verificador1 = 0;
		else
			verificador1 = 11 - verificador1;
		
		if(verificador1 != intCNPJ[12])
			throw new RuntimeException("cnpj invalido");
		
		soma=0;
		for( i = 0, j = 6; i < 5; i++, j--)
			soma += intCNPJ[i]*j;
		for(j = 9; i < 13; i++, j--)
			soma += intCNPJ[i]*j;
		verificador1 = soma%11;
		if(verificador1 < 2)
			verificador1 = 0;
		else
			verificador1 = 11 - verificador1;
	
		if(verificador1 == intCNPJ[13])
			CNPJ = cNPJ;
		else
			throw new RuntimeException("cnpj invalido");
	}
	
	
	
}
