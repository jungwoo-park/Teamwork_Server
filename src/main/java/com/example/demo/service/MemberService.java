package com.example.demo.service;


import com.example.demo.dto.MemberDto;
import com.example.demo.mapper.MemberMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

//    public List<MemberDto> getMemberList() {
//        return memberMapper.getMemberList();
//    }

    public MemberDto getMember(String kakaoToken) {
        return memberMapper.getMemberInfo(kakaoToken);
    }

    public int createMember(MemberDto member) {
        return memberMapper.createMember(member);
    }

}