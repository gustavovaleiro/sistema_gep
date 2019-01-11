package br.com.gustavovaleiro.verp.modelo.rh.auxiliar;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RG {
	
	@Column(name="pessoa_fisica_RG", length = 11)
	private String RG;
	
	@Column(name="pessoa_fisica_RG_EMISSOR", length = 6)
	private String Emissor;

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getEmissor() {
		return Emissor;
	}

	public void setEmissor(String emissor) {
		Emissor = emissor;
	}
	
	
}
