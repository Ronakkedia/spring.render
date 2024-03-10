package net.javaguides.springbootbackend.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
    @Column(name = "email_Id")
    private String emailId;
    @Column(name = "salary")
    private long salary;
    @OneToMany(targetEntity = Task.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "et_fk",referencedColumnName = "id")
    private List<Task> tasks;
}
