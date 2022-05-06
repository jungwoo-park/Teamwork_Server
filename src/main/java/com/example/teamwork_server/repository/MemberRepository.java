package com.example.teamwork_server.repository;


import com.example.teamwork_server.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{
    Member findByMemberId(int memberId);

    // Select * From user where id = ?
}
