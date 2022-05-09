package com.example.teamwork_server.controller;
import com.example.teamwork_server.domain.MemberSubject;
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

    //과목 단일 조회 api
    @ResponseBody
    @GetMapping(value = "/subject")
    public Subject getSubject(@RequestParam(value = "memberId") int id, Model model){
        return subjectService.findSubject(id);
    }

    //과목 여러개 조회 api
    @ResponseBody
    @GetMapping(value = "/subject/all")
    public List<MemberSubject> getSubjectAll(@RequestParam(value = "memberId") int id,Model model){
        return subjectService.findAllSubject(id);
    }

    //과목명 시간표 조회 api


    //과목 검색 api

    // 과목 저장 api

    // 사람들마다 시간표 저장하는 table 만들기


}
