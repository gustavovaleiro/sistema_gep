package br.com.gustavovaleiro.srp.modelo.pessoa.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_bairro")
public class Bairro {
	private Long id;
	private String bairro;
	
	@Id
	@GeneratedValue
	@Column(name = "bairro_id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(nullable = false, length = 20, name = "bairro_nome")
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
}
