package br.com.centroweg.Projeto_Rest.Repository;

import br.com.centroweg.Projeto_Rest.Model.Funcionario;
import br.com.centroweg.Projeto_Rest.Model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}