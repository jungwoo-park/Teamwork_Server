package com.example.teamwork_server.service;

import com.example.teamwork_server.domain.Article;
import com.example.teamwork_server.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service //repository를 핸들링하기 위하여.
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> findAllArticle(){
        return articleRepository.findAll();
    }
    public Article findArticle(int boardId) {
        return articleRepository.findArticleById(boardId);
    }
}
