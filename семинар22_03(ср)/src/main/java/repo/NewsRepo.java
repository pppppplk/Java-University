package repo;

import models.NewsModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface  NewsRepo extends JpaRepository<NewsModel, Long> {

    Optional<NewsModel> findById (Long id);

    List<NewsModel> findNewsModelsByName(String name);
}
