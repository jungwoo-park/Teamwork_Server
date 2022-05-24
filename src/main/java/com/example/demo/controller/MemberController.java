package com.example.demo.controller;

import com.example.demo.dto.MemberDto;
import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @ResponseBody
    @GetMapping(value = "/member/login") // email 을 기준으로 해당 유저가 있는지를 판단.
    public MemberDto findUser(@RequestParam(value = "kakaoToken") String kakaoToken) {
        MemberDto memberDto = memberService.getMember(kakaoToken);
        if(memberDto == null){
            memberDto= new MemberDto();
            memberDto.setKakaoToken("null");
            memberDto.setNickName("null");
            return memberDto;
        }
        return memberDto;
    }

    @ResponseBody
    @PostMapping(value = "/member/create") // 회원저장
    public int create(@RequestBody MemberDto memberDto) {
        return memberService.createMember(memberDto);
    }

}
