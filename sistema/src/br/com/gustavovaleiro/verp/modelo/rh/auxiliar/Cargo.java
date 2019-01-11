package br.com.gustavovaleiro.verp.modelo.rh.auxiliar;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cargo")
public class Cargo {
	
	@Id
	@GeneratedValue
	@Column(name = "cargo_id")
	private Integer id;
	
	@Column(name = "cargo_nome", nullable = false, length = 24)
	private String nomeCargo;
	
	@Column(name = "cargo_salariobase", nullable = false)
	private BigDecimal salarioBase;

	public Cargo(Integer id, String nomeCargo, BigDecimal salarioBase) {
		super();
		this.id = id;
		this.nomeCargo = nomeCargo;
		this.salarioBase = salarioBase;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCargo() {
		return nomeCargo;
	}

	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}

	public BigDecimal getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(BigDecimal salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
}
