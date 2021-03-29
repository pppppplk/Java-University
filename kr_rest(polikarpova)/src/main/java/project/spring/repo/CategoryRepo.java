package project.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import project.spring.models.Category;
import project.spring.models.Client;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
