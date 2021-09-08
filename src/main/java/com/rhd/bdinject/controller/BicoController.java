package com.rhd.bdinject.controller;


import com.rhd.bdinject.model.Bico;
import com.rhd.bdinject.repository.BicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bicos")
public class BicoController {
    @Autowired
    private BicoRepository repository;

    @GetMapping
    public List<Bico> listar() {
        return repository.findAll();
    }
}
