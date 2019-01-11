package br.com.gustavovaleiro.verp.modelo.rh.auxiliar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.gustavovaleiro.verp.modelo.rh.Pessoa;

@Entity
@Table(name = "tab_email")
public class Email {
	
	@Id
	@GeneratedValue
	@Column(name = "email_id")
	private Integer id;
	
	@Column(nullable = false, length = 60, name = "email_endereco")
	private String email;
	
	@Column(length = 140, name = "email_descricao")
	private String descricao;
	
	@ManyToOne
	private Pessoa pessoa;
	
	
	public Email(String email, String descricao) {
		super();
		this.email = email;
		this.descricao = descricao;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
