package br.com.centroweg.Projeto_Rest.controller;

import br.com.centroweg.Projeto_Rest.Model.Ferramenta;
import br.com.centroweg.Projeto_Rest.Repository.FerramentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class FerramentaMap {

    @Autowired
    private FerramentaRepository ferramentaRepo;

    @GetMapping("/getAllFerramenta")
    public List<Ferramenta> getAllFerramenta() {
        return ferramentaRepo.findAll();
    }


    @SuppressWarnings("rawtypes")
    @GetMapping("/search/ferramenta/{id}")
    public ResponseEntity findById(@PathVariable int id) {

        return ferramentaRepo.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/ferramenta/{id}")
    public List<Ferramenta> delete(@PathVariable int id) {

        ferramentaRepo.deleteById(id);

        return ferramentaRepo.findAll();
    }

    @PutMapping("/update/ferramenta/{id}")
    public ResponseEntity update(@PathVariable int id, @RequestBody Ferramenta ferramenta) {


        return ferramentaRepo.findById(id).map(record -> {

            record.setNomeFerramenta(ferramenta.getNomeFerramenta());
            record.setTipoFerramenta(ferramenta.getTipoFerramenta());
            record.setQtdFerramenta(ferramenta.getQtdFerramenta());
            record.setTotalFerramenta(ferramenta.getTotalFerramenta());

            Ferramenta updated = ferramentaRepo.save(record);
            return ResponseEntity.ok().body(updated);

        }).orElse(ResponseEntity.notFound().build());
    }
}


