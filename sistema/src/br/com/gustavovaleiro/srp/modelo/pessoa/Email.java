package br.com.gustavovaleiro.srp.modelo.pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tab_email")
public class Email {
	private Long id;
	private String email;
	private String descricao;
	private Pessoa pessoa;
	
	
	public Email(String email, String descricao) {
		super();
		this.email = email;
		this.descricao = descricao;
	}
	@Id
	@GeneratedValue
	@Column(name = "email_id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(nullable = false, length = 60, name = "email_endereco")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(length = 140, name = "email_descricao")
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@ManyToOne
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
