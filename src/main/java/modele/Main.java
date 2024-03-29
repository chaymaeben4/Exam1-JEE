package modele;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDB");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();


        tx.begin();
        Employee employe = new Employee(1L, "benlagraoui@gmail.com", Post.MANAGER);
        Project project1 = new Project(1L,"adidas" , 20.0);
        Project project2 = new Project(2L,"stell" , 20.0);
        Project project3 = new Project(3L,"CTM" , 20.0);
        Project project4 = new Project(4L,"Nestle" , 20.0);
        em.persist(project1);
        em.persist(project2);
        em.persist(project3);
        em.persist(project4);
        tx.commit();
        System.out.println("Employé enregistré avec succès !");

        List<String> names =new ArrayList<>();
        Query q = em.createNamedQuery("project.names");
        names=q.getResultList();
        System.out.println(names);
    }


}
