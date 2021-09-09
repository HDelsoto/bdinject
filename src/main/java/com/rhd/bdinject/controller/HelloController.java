package com.rhd.bdinject.controller;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import com.rhd.bdinject.model.Bico;
import com.rhd.bdinject.repository.BicoRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
	private BicoRepository repository;
   
     @GetMapping(value="/")
    public String getMtehodName(){
        return "Hello World2";
    }

    @PostMapping
	public Bico adicionar(@Valid @RequestBody Bico bico) {
		return repository.save(bico);
	}
	
	@GetMapping
	public List<Bico> listar() {
		return repository.findAll();
	}
    
}

