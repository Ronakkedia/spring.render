package net.javaguides.springbootbackend.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.javaguides.springbootbackend.model.Task;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TaskRequest {
    private Task task;


}
