package com.capgemini.wsb.persistence.dao.impl;


import java.util.List;
import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;



@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao {
    @PersistenceContext
    protected EntityManager entityManager;
    @Override
    public List<PatientEntity> findByLastName(String lastName) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<PatientEntity> criteriaQuery = builder.createQuery(PatientEntity.class);
        Root<PatientEntity> root = criteriaQuery.from(PatientEntity.class);
        Predicate lastNamePredicate = builder.equal(root.get("lastName"), lastName);


        criteriaQuery.where(lastNamePredicate);
        TypedQuery<PatientEntity> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }
}


