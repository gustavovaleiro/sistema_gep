package br.com.gustavovaleiro.srp.modelo.pessoa.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tab_endereco")
public class Endereco {
	private Long id;
	private Rua rua;
	private Bairro bairro;
	private Cidade cidade;
	private Estado estado;
	private int numero;
	private String complemento;
	private String CEP;
	
	
	@Id
	@GeneratedValue
	@Column(name = "endereco_id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name = "endereco_rua")
	public Rua getRua() {
		return rua;
	}
	public void setRua(Rua rua) {
		this.rua = rua;
	}
	
	@ManyToOne
	@JoinColumn(name = "endereco_bairro")
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "endereco_cidade")
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "endereco_Estado")
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	@Column( name = "endereco_numero")
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Column(name = "endereco_complemento")
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	@Column(nullable = false, length = 8, name = "endereco_CEP")
	public String getCEP() {
		return CEP;
	}
	
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	
	
}
