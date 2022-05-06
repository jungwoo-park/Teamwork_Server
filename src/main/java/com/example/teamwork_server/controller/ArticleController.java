package com.example.teamwork_server.controller;
import com.example.teamwork_server.domain.Article;
import com.example.teamwork_server.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor //생성자역할대신.
@Controller // 컨트롤러가 서비스를 부른다. 서비스는 repository(DB)를 부른다.
public class ArticleController {
    private final ArticleService articleService;

    //게시글 부분조회 api -> GET
    @ResponseBody
    @GetMapping(value = "/articles")
    public List<Article> getArticles(@RequestParam(value = "groupsId") int id, Model model) { //localhost:8080/article?groupsId=1
        return articleService.findArticleByGroupId(id);
    }

    //게시글 단일조회 api -> GET
    @ResponseBody
    @GetMapping(value = "/article")
    public Article getArticleInfo(@RequestParam(value = "articleId") int id,Model model){
        return articleService.findByArticleId(id);
    }

    //게시글 작성
    @ResponseBody
    @PostMapping(value = "/article/save")
    public Article saveArticle(@RequestBody Article article, Model model) { //localhost:8080/article?groupsId=1
        Date now = new Date();
        article.setCreatedAt(now);
        return articleService.saveArticle(article);
    }
    //게시글 수정



    //게시글 삭제
}

// 게시글 Creat Read Update Delete
