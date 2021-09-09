package com.rhd.bdinject.repository;

import com.rhd.bdinject.model.Bico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BicoRepository extends JpaRepository<Bico, Long> {

    @Query("SELECT b.nome FROM Bico b where b.id = :id")
    String findNomeById(@Param("id") Long id);

}

