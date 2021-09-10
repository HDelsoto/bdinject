package com.rhd.bdinject.repository;
import com.rhd.bdinject.model.Bico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BicoRepository extends JpaRepository<Bico, Long> {
    public String findNomeById(Long id);
}


