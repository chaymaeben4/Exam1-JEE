package modele;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "employee")
@NamedQueries({
        @NamedQuery(name="employee.findAll" , query = " SELECT employee FROM employee employee ")
})
public class Employee{
    @Id
    private Long id;
    private String name ;
    private String email;
    private Post post;
//    private List<String> skills;
@ManyToMany(cascade = CascadeType.PERSIST)
@JoinTable(
        name = "charge",
        joinColumns = @JoinColumn(name = "employee_id"),
        inverseJoinColumns = @JoinColumn(name = "project_id")
)
    private List<Project> project = new ArrayList<>();

    public Employee(Long id, String email, Post post) {
        this.id = id;
        this.email = email;
        this.post = post;
    }

    public Employee() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //    public List<String> getSkills() {
//        return skills;
//    }
//
//    public void setSkills(List<String> skills) {
//        this.skills = skills;
//    }
}
