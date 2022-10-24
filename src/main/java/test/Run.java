
package test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Run {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("templatePU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        System.out.println("TESTEO DEL PROYECTO BASE CORRECTO!!");

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
