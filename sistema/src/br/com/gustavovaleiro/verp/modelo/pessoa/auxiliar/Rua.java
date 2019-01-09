package br.com.gustavovaleiro.verp.modelo.pessoa.auxiliar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_rua")
public class Rua {
	
	@Id
	@GeneratedValue
	@Column(name = "rua_id")
	private Integer id;
	
	@Column(name = "rua_nome")
	private String nome;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	
}
