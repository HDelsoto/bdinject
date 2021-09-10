package com.rhd.bdinject.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Component
public class BicoRepositoryImpl  {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private BicoRepository bicoRepository;

    /*@SuppressWarnings("unused")
    public List<MyEntity> doSomeHql(Long id) {
        String hql = "SELECT eFROM MyEntity e WHERE e.id = :id";
        TypedQuery<MyEntity> query = entityManager.createQuery(hql, MyEntity.class);
        query.setParameter("id", id);
        return query.getResultList();
    }

    @SuppressWarnings("unused")
    public List<MyEntity> useTheRepo(Long id) {
        List<MyEntity> es = doSomeHql(id);
        es.addAll(myEntityRepository.findByCommentEndsWith("DO"));
        es.add(myEntityRepository.findById(2L).get());
        return es;
    }*/

    public String findNomeById(Long id){
        StringBuilder sql = new StringBuilder();
        sql.append(" FROM Bico b");
        sql.append(" WHERE b.id = :id ");
        TypedQuery<String> query = entityManager.createQuery(sql.toString(), String.class);
        query.setParameter("id",id);
        return query.getSingleResult();
    }

}
