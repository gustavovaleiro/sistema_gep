package br.com.gustavovaleiro.verp.modelo.rh;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.com.gustavovaleiro.verp.modelo.rh.auxiliar.CNPJ;

@Entity
@Table(name = "tab_pessoa_juridica")
@PrimaryKeyJoinColumn(name ="pessoa_juridica_idPessoa")
public class PessoaJuridica extends Pessoa {
	
	@Embedded
	@Column(nullable = false)
	private CNPJ cnpj; 
	
	@Column(name = "pessoa_juridica_razaoSocial", nullable = false)
	private String RazaoSocial;

	
	
	public CNPJ getCnpj() {
		return cnpj;
	}

	public void setCnpj(CNPJ cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}
	
	
}
