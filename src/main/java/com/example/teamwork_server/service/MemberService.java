package com.example.teamwork_server.service;

import com.example.teamwork_server.domain.Member;
import com.example.teamwork_server.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service //repository를 핸들링하기 위하여.
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member findMember(int memberId){
        return memberRepository.findByMemberId(memberId);
    }

}
