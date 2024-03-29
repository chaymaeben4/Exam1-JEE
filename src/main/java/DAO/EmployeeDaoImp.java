package DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import modele.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImp implements EmployeeDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDB");
    EntityManager em = emf.createEntityManager();
    public List<Employee> selectAll(){

        List<Employee> employees ;
        Query q = em.createNamedQuery("employee.findAll");
        employees=q.getResultList();
        return employees;
    }

    public List<String> names_project(){
        List<String> names;
        Query q= em.createNamedQuery("project.names");
        names=q.getResultList();
        return names;
    }

}
