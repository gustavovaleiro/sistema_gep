package br.com.gustavovaleiro.verp.modelo.pessoa.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_bairro")
public class Bairro {
	@Id
	@GeneratedValue
	@Column(name = "bairro_id")
	private Integer id;
	
	@Column(nullable = false, length = 20, name = "bairro_nome")
	private String bairro;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
}
