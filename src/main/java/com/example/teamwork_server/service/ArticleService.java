package com.example.teamwork_server.service;

import com.example.teamwork_server.domain.Article;
import com.example.teamwork_server.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service //repository를 핸들링하기 위하여.
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;
    Date now = new Date();
    public List<Article> findAllArticle(){
        return articleRepository.findAll();
    }
    public List<Article> findArticleByGroupId(int groupsId){
        return articleRepository.findByGroupsIdOrderByCreatedAtAsc(groupsId);
    }
    public Article findByArticleId(int articleId){
        Article article = articleRepository.findByArticleId(articleId);
        articleRepository.updateCount(article.getCount()+1,articleId);
        return article;
    }
    public Article saveArticle(Article article) {
        article.setCreatedAt(now);
        return articleRepository.save(article);
    }

    public Article updateArticle(Article article, int articleId){
        Article findArticle = articleRepository.findByArticleId(articleId);
        findArticle.setArticleTitle(article.getArticleTitle());
        findArticle.setContent(article.getContent());
        findArticle.setUpdatedAt(now);
        return articleRepository.save(findArticle);
    }

    public void deleteArticle(int articleId){
        Article findArticle = articleRepository.findByArticleId(articleId);
        articleRepository.delete(findArticle);
    }
}
