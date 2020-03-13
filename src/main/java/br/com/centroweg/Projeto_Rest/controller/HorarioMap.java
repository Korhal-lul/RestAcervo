package br.com.centroweg.Projeto_Rest.controller;

import br.com.centroweg.Projeto_Rest.Model.Horario;
import br.com.centroweg.Projeto_Rest.Model.Pessoa;
import br.com.centroweg.Projeto_Rest.Repository.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HorarioMap {

    @Autowired
    private HorarioRepository horarioRepo;

    @GetMapping("/getAllHorario")
    public List<Horario> getAllHorario() {
        return horarioRepo.findAll();
    }

    @PostMapping("/insert/horario")
    public String insert(@RequestBody Horario object) {

        horarioRepo.save(object);

        return "Insert of " + object.toString() + " successful ";
    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/search/horario/{id}")
    public ResponseEntity findById(@PathVariable int id) {

        return horarioRepo.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/horario/{id}")
    public List<Horario> delete(@PathVariable int id) {

        horarioRepo.deleteById(id);

        return horarioRepo.findAll();
    }

    @PutMapping("/update/horario/{id}")
    public ResponseEntity update(@PathVariable int id, @RequestBody Horario horario) {


        return horarioRepo.findById(id).map(record -> {

            record.setEntrada(horario.getEntrada());
            record.setSaida(horario.getSaida());
            record.setFuncionarios(horario.getFuncionarios());

            Horario updated = horarioRepo.save(record);
            return ResponseEntity.ok().body(updated);

        }).orElse(ResponseEntity.notFound().build());
    }
}
