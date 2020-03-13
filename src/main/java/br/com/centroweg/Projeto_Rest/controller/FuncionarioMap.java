package br.com.centroweg.Projeto_Rest.controller;

import br.com.centroweg.Projeto_Rest.Model.Funcionario;
import br.com.centroweg.Projeto_Rest.Model.Pessoa;
import br.com.centroweg.Projeto_Rest.Repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FuncionarioMap {

    @Autowired
    private FuncionarioRepository funcionarioRepo;

    @GetMapping("/getAllFuncionario")
    public List<Funcionario> getAllFuncionario() {
        return funcionarioRepo.findAll();
    }

    @PostMapping("/insert/funcionario")
    public String insert(@RequestBody Funcionario object) {

        System.out.println(object.toString());

        funcionarioRepo.save(object);

        return "Insert of " + object.toString() + " successful ";
    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/search/funcionario/{id}")
    public ResponseEntity findById(@PathVariable int id) {

        return funcionarioRepo.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/funcionario/{id}")
    public List<Funcionario> delete(@PathVariable int id) {

        funcionarioRepo.deleteById(id);

        return funcionarioRepo.findAll();
    }

    @PutMapping("/update/funcionario/{id}")
    public ResponseEntity update(@PathVariable int id, @RequestBody Funcionario funcionario) {


        return funcionarioRepo.findById(id).map(record -> {

            record.setNumeroCracha(funcionario.getNumeroCracha());
            record.setSalario(funcionario.getSalario());
            record.setHorario(funcionario.getHorario());

            Funcionario updated = funcionarioRepo.save(record);
            return ResponseEntity.ok().body(updated);

        }).orElse(ResponseEntity.notFound().build());
    }
}
