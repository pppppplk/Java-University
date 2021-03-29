package project.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import project.spring.models.Client;
import project.spring.models.Task;

public interface TaskRepo extends JpaRepository<Task, Long> {

    Task findTasksById (Long id);
}
