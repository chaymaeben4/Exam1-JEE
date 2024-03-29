package DAO;

import modele.Employee;

import java.util.List;

public interface EmployeeDao {
List<Employee> selectAll();
List<String> names_project();
}
