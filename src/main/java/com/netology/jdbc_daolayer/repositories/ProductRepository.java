package com.netology.jdbc_daolayer.repositories;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository
public class ProductRepository {


    @PersistenceContext
    private EntityManager entityManager;

    public List<String> getProductName(String name) {
        Query query = entityManager.createQuery("select o.product_name from Order o join o.customer c WHERE c.name = :name", String.class);
        query.setParameter("name", name);
        List<String> productNameList = query.getResultList();
        return productNameList;
    }
}
