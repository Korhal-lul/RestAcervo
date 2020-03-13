package br.com.centroweg.Projeto_Rest.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Funcionario")
public class Funcionario {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String numeroCracha;
    @Column(nullable = false)
    private String salario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idHorario", referencedColumnName = "id")
    private Horario horario;

    @OneToOne
    @JoinColumn(name = "idPessoa", referencedColumnName = "id")
    private Pessoa pessoa;

    public int getId() {
        return id;
    }
    
    public String getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(String numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
