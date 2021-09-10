package com.rhd.bdinject.repository;
import com.rhd.bdinject.model.Bico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BicoRepository extends JpaRepository<Bico, Long> {
   /* @Autowired
    @Lazy
    public String findNomeById(Long id){
        StringBuilder sql = new StringBuilder();
        sql.append(" FROM Bico b");
        sql.append(" WHERE b.id = :id ");
        TypedQuery<String> query = this.getEntityManager().createdQuery(sql.toString(), String.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }*/
}


