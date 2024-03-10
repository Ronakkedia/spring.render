package net.javaguides.springbootbackend.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.javaguides.springbootbackend.model.Employee;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest {
    private Employee employee;
}
