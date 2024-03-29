package service;

import DAO.EmployeeDao;
import DAO.EmployeeDaoImp;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import modele.Employee;
import modele.Post;

import java.util.List;

public class AffecationBean {
private EmployeeDao employeeDao;

    public AffecationBean() {
        this.employeeDao=new EmployeeDaoImp();
    }
    public List<Employee> employees(){
        return employeeDao.selectAll();
    }
    public List<String> project_names(){
        return employeeDao.names_project();
    }
}
