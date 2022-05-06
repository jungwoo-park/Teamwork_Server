package com.example.teamwork_server.controller;

import com.example.teamwork_server.domain.Member;
import com.example.teamwork_server.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor //생성자역할대신.
@Controller // 컨트롤러가 서비스를 부른다. 서비스는 repository(DB)를 부른다.
public class MemberController {
    private final MemberService memberService;

    //유저 단일 조회 api (마이페이지)
    @ResponseBody
    @GetMapping(value="/member")
    public Member getMember(@RequestParam(value = "memberId") int id, Model model){
        return memberService.findMember(id);
    }


    public void getMax(int a, int b, int c){
        int max = a;
        if(a < b)
            max = b;

    }
}
