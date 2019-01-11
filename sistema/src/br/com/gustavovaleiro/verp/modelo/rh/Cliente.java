package br.com.gustavovaleiro.verp.modelo.rh;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tab_cliente")
public class Cliente {
	
	@Id
	@OneToMany(mappedBy = "Pessoa")
	@Column(nullable = false, name = "cliente_pessoa")
	private Pessoa pessoa;
	


	@Column(nullable = false, name = "cliente_limite_compra")
	private BigDecimal limite_compra;
	
	

	public Cliente(Pessoa pessoa, BigDecimal limite_compra) {
		super();
		this.pessoa = pessoa;
		this.limite_compra = limite_compra;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public BigDecimal getLimite_compra() {
		return limite_compra;
	}

	public void setLimite_compra(BigDecimal limite_compra) {
		this.limite_compra = limite_compra;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}
	
}
