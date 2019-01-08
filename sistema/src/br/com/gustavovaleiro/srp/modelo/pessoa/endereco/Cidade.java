package br.com.gustavovaleiro.srp.modelo.pessoa.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_cidade")
public class Cidade {
	private Long id;
	private String nome;
	
	@Id
	@GeneratedValue
	@Column(name = "cidade_id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(nullable = false, length = 60, name = "cidade_nome")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
