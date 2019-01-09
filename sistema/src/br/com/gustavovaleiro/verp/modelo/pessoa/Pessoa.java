 package br.com.gustavovaleiro.verp.modelo.pessoa;

import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import br.com.gustavovaleiro.verp.modelo.pessoa.auxiliar.Email;
import br.com.gustavovaleiro.verp.modelo.pessoa.auxiliar.Endereco;
import br.com.gustavovaleiro.verp.modelo.pessoa.auxiliar.Telefone;
import br.com.gustavovaleiro.verp.util.ConfigTemp;

@Entity
@Table(name = "tab_pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
	
	@Id
	@GeneratedValue
	@Column(name = "pessoa_id")
	private Integer id;
	
	@Column(length = 60, nullable = false, name = "pessoa_nome")
	private String nome;
	
	@OneToMany
	private List<Email> email;
	
	@OneToMany
	private List<Telefone> telefone;
	
	@OneToMany
	private List<Endereco> endereco;
	
	
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
	
	
	public List<Email> getEmail() {
		return Collections.unmodifiableList(email);
	}
	
	public void addEmail(Email email) {
		if(ConfigTemp.limiteEmail <= this.email.size())
			this.email.add(email);
		else
			throw new RuntimeException("Numero de email excedidos");
	}
	

	public List<Telefone> getTelefone() {
		return Collections.unmodifiableList(telefone);
	}
	
	public void addTelefone(Telefone telefone) {
		if(ConfigTemp.limiteTelefone <= this.telefone.size())
			this.telefone.add(telefone);
		else
			throw new RuntimeException("Numero de telefone excedidos");
	}
	

	public List<Endereco> getEndereco() {
		return Collections.unmodifiableList(endereco);
	}
	
	public void setEndereco(Endereco endereco) {
		if(ConfigTemp.limiteTelefone <= this.endereco.size())
			this.endereco.add(endereco);
		else
			throw new RuntimeException("Numero de endereco excedidos");
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
