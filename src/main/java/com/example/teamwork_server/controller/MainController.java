package com.example.teamwork_server.controller;
import com.example.teamwork_server.domain.Article;
import com.example.teamwork_server.domain.Subject;
import com.example.teamwork_server.domain.User;
import com.example.teamwork_server.service.ArticleService;
import com.example.teamwork_server.service.SubjectService;
import com.example.teamwork_server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@RequiredArgsConstructor //생성자역할대신.
@Controller // 컨트롤러가 서비스를 부른다. 서비스는 repository(DB)를 부른다.
public class MainController {
    private final ArticleService articleService;
    private final UserService userService;
    private final SubjectService subjectService;
    //게시글 전체조회 api
    @ResponseBody
    @GetMapping(value="/board/all")
    public List<Article> getAllBoard(){
        return articleService.findAllArticle();
    }
    //게시글 부분조회 api
    @ResponseBody
    @GetMapping(value="/board")
    public Article getBoard(@RequestParam(value ="boardId") int id, Model model){
        return articleService.findArticle(id);

    }
    //유저 단일 조회 api (마이페이지)
    @ResponseBody
    @GetMapping(value="/user")
    public User getUser(@RequestParam(value = "userId") int id, Model model){
        return userService.findUser(id);
    }
    //과목 전체 조회 api
    @ResponseBody
    @GetMapping(value = "/subject/all")
    public List<Subject> getAllSubject(){
        return subjectService.findAllSubject();
    }
    //과목 단일 조회 api
    @ResponseBody
    @GetMapping(value = "/subject")
    public Subject getSubject(@RequestParam(value = "subjectId") int id, Model model){
        return subjectService.findSubject(id);
    }

    //게시글 저장
//    @PostMapping(value = "/board/save")
//    @ResponseBody
//    public String boardPostMapping() {
//        return "Okay";
//  templete - html . html을 사용안할 경우 @ResponseBody를 필수로 적기.

}
