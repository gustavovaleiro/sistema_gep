package br.com.gustavovaleiro.verp.modelo.rh;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.gustavovaleiro.verp.modelo.rh.auxiliar.Cargo;

@Entity
@Table(name = "tab_funcionario")
public class Funcionario {
	
	@Id
	@OneToMany(mappedBy = "Pessoa")
	@Column(nullable = false, name = "funcionario_pessoa")
	private Pessoa pessoa;
	
	@Column(nullable = false, name = "funcionario_cargo")
	private Cargo cargo;
	
	@Column(nullable = false, name = "funcionario_data_admissao")
	private LocalDate dataDeAdmissao;
	
	@Column(name = "funcionario_bonus")
	private BigDecimal bonus;
	
	@Column(name = "funcionario_salario_bruto")
	private BigDecimal salarioBruto;
	
	
	public Funcionario(Pessoa pessoa, Cargo cargo, LocalDate dateDeAdmissao, BigDecimal bonus) {
		super();
		this.pessoa = pessoa;
		this.cargo = cargo;
		this.dataDeAdmissao = dateDeAdmissao;
		this.salarioBruto = cargo.getSalarioBase().add(bonus);
		this.bonus = bonus;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	

	public LocalDate getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(LocalDate dateDeAdmissao) {
		this.dataDeAdmissao = dateDeAdmissao;
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
		Funcionario other = (Funcionario) obj;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}
	
	
}
