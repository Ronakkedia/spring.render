package net.javaguides.springbootbackend.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tasks")

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "employee_Id")
    private long employeeId;

    @Column(name = "titles")
    private String title;
}
