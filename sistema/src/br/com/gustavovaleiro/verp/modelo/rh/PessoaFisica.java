package br.com.gustavovaleiro.verp.modelo.rh;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.com.gustavovaleiro.verp.modelo.rh.auxiliar.CPF;
import br.com.gustavovaleiro.verp.modelo.rh.auxiliar.RG;

@Entity
@Table(name = "tab_pessoa_fisica")
@PrimaryKeyJoinColumn(name ="pessoa_fisica_idPessoa")
public class PessoaFisica extends Pessoa {
	
	@Embedded
	@Column(name = "pessoa_fisica_cpf", nullable = false, length = 11)
	private CPF cpf; // fazer o uso da classe embutida aqui pro cpf e o rg
	
	@Column(name = "pessoa_fisica_data_nascimento", nullable = false)
	private LocalDate dataNascimento;
	
	@Column(name = "pessoa_fisica_RG", length = 10)
	private RG RG;
	

	

}
