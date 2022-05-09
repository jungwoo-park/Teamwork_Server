package com.example.teamwork_server.repository;
import com.example.teamwork_server.domain.MemberSubject;
import com.example.teamwork_server.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{
    List<Subject> findAll();
    Subject findBySubjectId(int subjectId);
    @Query(value = "select member_subject.member_id, s.subject_name, s.subject_day from member_subject left join subject s on member_subject.subject_id = s.subject_id where member_subject.member_id = ?1", nativeQuery = true)
    List<MemberSubject> findAllSubject(int memberId);
}
