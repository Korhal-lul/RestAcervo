package br.com.centroweg.Projeto_Rest.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Horario {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String entrada;
    @Column(nullable = false)
    private String saida;

    @OneToMany(mappedBy = "horario")
    private List<Funcionario> funcionarios;
    

    public int getId() {
        return id;
    }
    
    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

}
