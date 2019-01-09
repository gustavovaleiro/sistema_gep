package br.com.gustavovaleiro.verp.modelo.pessoa;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "tab_pessoa_fisica")
@PrimaryKeyJoinColumn(name ="pessoa_fisica_idPessoa")
public class PessoaFisica extends Pessoa {
	
	@Column(name = "pessoa_fisica_cpf", nullable = false, length = 11)
	private // fazer o uso da classe embutida aqui pro cpf e o rg
	
	@Column(name = "pessoa_fisica_data_nascimento", nullable = false)
	private LocalDate dataNascimento;
	
	@Column(name = "pessoa_fisica_RG", length = 10)
	private String RG;
	
	private String
	

}
