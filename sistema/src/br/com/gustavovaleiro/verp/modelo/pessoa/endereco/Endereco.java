package br.com.gustavovaleiro.verp.modelo.pessoa.endereco;

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
	

	@Id
	@GeneratedValue
	@Column(name = "endereco_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "endereco_rua")
	private Rua rua;
	
	@ManyToOne
	@JoinColumn(name = "endereco_bairro")
	private Bairro bairro;
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "endereco_cidade")
	private Cidade cidade;
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "endereco_Estado")
	private Estado estado;
	
	@Column( name = "endereco_numero")
	private int numero;
	
	@Column(name = "endereco_complemento")
	private String complemento;
	
	@Column(nullable = false, length = 8, name = "endereco_CEP")
	private String CEP;
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Rua getRua() {
		return rua;
	}
	public void setRua(Rua rua) {
		this.rua = rua;
	}
	
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	public String getCEP() {
		return CEP;
	}
	
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	
	
}
