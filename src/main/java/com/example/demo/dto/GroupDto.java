package com.example.demo.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PROTECTED;

@Getter
@Builder
@NoArgsConstructor //자바는 기본적으로 기본생성자를 만들어줌, @setter 가잇으면 기본 생성자가 없음
@AllArgsConstructor //  @setter 빼면 기본생성자 만들어줌, @AllArgsConstructor 만들면 기본 생성자가없음
public class GroupDto {
    private int groupsId;
    private int memberId;

    // LocalDateTime 멀티쓰레드환경에서 안전 (thread safe)
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;

    // static factory method pattern
    // of / from -> 여러가지 인자값으로 객체 만듬 / 한가지 인자값으로 객체 만듬
    public static GroupDto of (int groupsId, int memberId, LocalDateTime createdAt, LocalDateTime deletedAt){
        return GroupDto.builder()
                .groupsId(groupsId)
                .createdAt(createdAt)
                .deletedAt(deletedAt)
                .memberId(memberId).build();
    }

}
