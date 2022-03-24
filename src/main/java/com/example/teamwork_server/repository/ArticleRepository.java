package com.example.teamwork_server.repository;
import com.example.teamwork_server.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //DB
public interface ArticleRepository extends JpaRepository<Article, Long> {
    Article findArticleById(int boardId);
}
