package jscode.repository;

import jscode.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article,Long> {
//    List<Article> findAll();
//    Optional<Article> findById(Long id);
//    Article findByTitle(String title);

}
