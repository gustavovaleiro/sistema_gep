 package br.com.gustavovaleiro.srp.modelo.pessoa;

import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.gustavovaleiro.srp.modelo.pessoa.endereco.Endereco;
import br.com.gustavovaleiro.srp.util.ConfigTemp;

@Entity
@Table(name = "tab_pessoa")
public class Pessoa {
	
	private Long id;
	private String nome;
	private List<Email> email;
	private List<Telefone> telefone;
	private List<Endereco> endereco;
	
	@Id
	@GeneratedValue
	@Column(name = "pessoa_id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	@Column(length = 60, nullable = false, name = "pessoa_nome")
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@OneToMany
	public List<Email> getEmail() {
		return Collections.unmodifiableList(email);
	}
	
	public void addEmail(Email email) {
		if(ConfigTemp.limiteEmail <= this.email.size())
			this.email.add(email);
		else
			throw new RuntimeException("Numero de email excedidos");
	}
	
	@OneToMany
	public List<Telefone> getTelefone() {
		return Collections.unmodifiableList(telefone);
	}
	
	public void addTelefone(Telefone telefone) {
		if(ConfigTemp.limiteTelefone <= this.telefone.size())
			this.telefone.add(telefone);
		else
			throw new RuntimeException("Numero de telefone excedidos");
	}
	
	@OneToMany
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