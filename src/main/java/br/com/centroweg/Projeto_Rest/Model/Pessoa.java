package br.com.centroweg.Projeto_Rest.Model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Pessoa")
public class Pessoa {

	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false)
	private String nomePessoa;
	@Column(nullable = false)
	private String cpfPessoa;
	@Column(nullable = false)
	private String nascimentoPessoa;

	@OneToOne(mappedBy = "pessoa", optional = false)
	private Funcionario funcionario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getCpfPessoa() {
		return cpfPessoa;
	}

	public void setCpfPessoa(String cpfPessoa) {
		this.cpfPessoa = cpfPessoa;
	}

	public String getNascimentoPessoa() {
		return nascimentoPessoa;
	}

	public void setNascimentoPessoa(String nascimentoPessoa) {
		this.nascimentoPessoa = nascimentoPessoa;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
