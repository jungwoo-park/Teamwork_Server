package com.example.teamwork_server.repository;
import com.example.teamwork_server.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{
    List<Subject> findAll();

    Subject findBySubjectId(int subjectId);

}
