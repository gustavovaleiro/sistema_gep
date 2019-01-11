package br.com.gustavovaleiro.verp.modelo.rh.auxiliar.localizacao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_estado")
public class Estado {
	private Long id;
	private String UF;
	private String nome;
	
	@Id
	@GeneratedValue
	@Column(name = "estado_id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(nullable = false, length = 2, name = "estado_uf")
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	
	@Column(length = 20, name = "estado_nome")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
