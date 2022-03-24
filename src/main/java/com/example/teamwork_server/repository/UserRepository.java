package com.example.teamwork_server.repository;


import com.example.teamwork_server.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUserId(int userId);

    // Select * From user where id = ?
}
