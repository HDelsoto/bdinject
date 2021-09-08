package com.rhd.bdinject.controller;


import com.rhd.bdinject.model.Bico;
import com.rhd.bdinject.repository.BicoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bicos")
public class BicoController {
    @Autowired
    private BicoRepository repository;

    @PostMapping
    public Bico adicionar(@Valid @RequestBody Bico bico) {
        return repository.save(bico);
    }

    @GetMapping
    public List<Bico> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bico> buscar(@PathVariable Long id) {
        Bico bico = repository.getOne(id);
        if (bico == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(bico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bico> atualizar(@PathVariable Long id,
                                             @Valid @RequestBody Bico bico) {
        Bico existente = repository.getOne(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }
        BeanUtils.copyProperties(bico, existente, "id");
        existente = repository.save(existente);
        return ResponseEntity.ok(existente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        Bico bico = repository.getOne(id);
        if (bico == null) {
            return ResponseEntity.notFound().build();
        }
        repository.delete(bico);
        return ResponseEntity.noContent().build();
    }
}
