package net.javaguides.springbootbackend.repository;

import net.javaguides.springbootbackend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
