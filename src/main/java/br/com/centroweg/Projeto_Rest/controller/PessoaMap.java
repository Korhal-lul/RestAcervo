package br.com.centroweg.Projeto_Rest.controller;

import br.com.centroweg.Projeto_Rest.Model.Ferramenta;
import br.com.centroweg.Projeto_Rest.Model.Funcionario;
import br.com.centroweg.Projeto_Rest.Model.Pessoa;
import br.com.centroweg.Projeto_Rest.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PessoaMap {

    @Autowired
    private PessoaRepository pessoaRepo;

    @GetMapping("/getAllPessoa")
    public List<Pessoa> getAllPessoa() {
        return pessoaRepo.findAll();
    }

    @PostMapping("/insert/pessoa")
    public String insert(@RequestBody Pessoa object) {

        pessoaRepo.save(object);

        return "Insert of " + object.toString() + " successful ";
    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/search/pessoa/{id}")
    public ResponseEntity findById(@PathVariable int id) {

        return pessoaRepo.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/pessoa/{id}")
    public List<Pessoa> delete(@PathVariable int id) {

        pessoaRepo.deleteById(id);

        return pessoaRepo.findAll();
    }

    @PutMapping("/update/pessoa/{id}")
    public ResponseEntity update(@PathVariable int id, @RequestBody Pessoa pessoa) {


        return pessoaRepo.findById(id).map(record -> {

            record.setNomePessoa(pessoa.getNomePessoa());
            record.setCpfPessoa(pessoa.getCpfPessoa());
            record.setNascimentoPessoa(pessoa.getNascimentoPessoa());
            record.setFuncionario(pessoa.getFuncionario());

            Pessoa updated = pessoaRepo.save(record);
            return ResponseEntity.ok().body(updated);

        }).orElse(ResponseEntity.notFound().build());
    }
}
