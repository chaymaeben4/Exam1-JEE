package modele;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@NamedQuery(name="project.names" , query = "SELECT project.name FROM project project")
@Entity(name="project")
public class Project {
    @Id
    private Long id;
    private String name;
    private Double budget;


    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "charge",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id")
    )
    private List<Employee> employees =new ArrayList<>();

    public Project(Long id, String name, Double budget) {
        this.id = id;
        this.name = name;
        this.budget = budget;
    }

    public Project() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }
}
