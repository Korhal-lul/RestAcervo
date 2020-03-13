package br.com.centroweg.Projeto_Rest.controller;

import br.com.centroweg.Projeto_Rest.Model.Ferramenta;
import br.com.centroweg.Projeto_Rest.Model.Funcionario;
import br.com.centroweg.Projeto_Rest.Model.Pessoa;
import br.com.centroweg.Projeto_Rest.Repository.FerramentaRepository;
import br.com.centroweg.Projeto_Rest.Repository.FuncionarioRepository;
import br.com.centroweg.Projeto_Rest.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Insert {
    @Autowired
    private PessoaRepository pessoaRepo;
    @Autowired
    private FuncionarioRepository funcionarioRepo;
    @Autowired
    private FerramentaRepository ferramentaRepo;

    @PostMapping("/insert")
    public String insert(@RequestBody Object object) {
        if(object instanceof Pessoa){
            pessoaRepo.save((Pessoa)object);
        }else if(object instanceof Ferramenta){
            ferramentaRepo.save((Ferramenta) object);
        } else if(object instanceof Funcionario){
            funcionarioRepo.save((Funcionario)object);
        }

        return "Insert of " + object.toString() + " successful";
    }
}
