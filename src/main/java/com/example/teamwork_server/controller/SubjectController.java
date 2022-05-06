package com.example.teamwork_server.controller;
import com.example.teamwork_server.domain.Subject;
import com.example.teamwork_server.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequiredArgsConstructor //생성자역할대신.
@Controller // 컨트롤러가 서비스를 부른다. 서비스는 repository(DB)를 부른다.
public class SubjectController {
    private final SubjectService subjectService;

    //과목 전체 조회 api
//    @ResponseBody
//    @GetMapping(value = "/subject/all")
//    public List<Subject> getAllSubject(){
//        return subjectService.findAllSubject();
//    }
    //과목 단일 조회 api
    @ResponseBody
    @GetMapping(value = "/subject")
    public Subject getSubject(@RequestParam(value = "memberId") int id, Model model){
        return subjectService.findSubject(id);
    }
}
//url user 추가 1번 이 듣는 과목
// url post
// - get방식 : 시간표를 가져오는데 목요일에 시간표를 가지고 오고싶다. DB에서 목요일에 시간표를 뽑느다.
// - post방식: 보안적...

