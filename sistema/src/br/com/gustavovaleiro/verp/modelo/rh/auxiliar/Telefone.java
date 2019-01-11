package br.com.gustavovaleiro.verp.modelo.rh.auxiliar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_telefone")
public class Telefone {
	@Id
	@GeneratedValue
	@Column( name = "telefone_id")
	private Integer id;
	
	@Column(length = 3, nullable = false, name = "telefone_ddd")
	private String DDD;
	
	@Column(length = 9, nullable = false, name = "telefone_ddd")
	private String numero;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDDD() {
		return DDD;
	}
	public void setDDD(String dDD) {
		DDD = dDD;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
