package com.example.teamwork_server.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor //생성자역할대신.
@Controller // 컨트롤러가 서비스를 부른다. 서비스는 repository(DB)를 부른다.
public class MainController {


    }

    //게시글 저장
//    @PostMapping(value = "/board/save")
//    @ResponseBody
//    public String boardPostMapping() {
//        return "Okay";
//  templete - html . html을 사용안할 경우 @ResponseBody를 필수로 적기.
// memberService에
