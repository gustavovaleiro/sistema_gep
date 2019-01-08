package br.com.gustavovaleiro.srp.modelo.pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_telefone")
public class Telefone {
	private Long id;
	private String DDD;
	private String numero;
	
	
	@Id
	@GeneratedValue
	@Column( name = "telefone_id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(length = 3, nullable = false, name = "telefone_ddd")
	public String getDDD() {
		return DDD;
	}
	public void setDDD(String dDD) {
		DDD = dDD;
	}
	@Column(length = 9, nullable = false, name = "telefone_ddd")
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
