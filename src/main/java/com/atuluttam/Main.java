package com.atuluttam;

import com.atuluttam.entities.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.jpa.HibernatePersistenceProvider;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome To Hibernate!!!");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");;

        EntityManager em = emf.createEntityManager(); //Represents the context;
try {

    em.getTransaction().begin();

    Product p = new Product();
    p.setId(2L);
    p.setName("Laptop");

    em.persist(p);
    em.getTransaction().commit();
}
finally {
    em.close();
}


    }
}