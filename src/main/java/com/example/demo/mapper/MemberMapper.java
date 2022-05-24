package com.example.demo.mapper;

import com.example.demo.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface MemberMapper {
    MemberDto getMemberInfo(@Param("kakaoToken") String kakaoToken);
    int createMember(MemberDto member);
}