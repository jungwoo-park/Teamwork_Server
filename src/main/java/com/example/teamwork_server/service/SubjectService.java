package com.example.teamwork_server.service;


import com.example.teamwork_server.domain.MemberSubject;
import com.example.teamwork_server.domain.Subject;
import com.example.teamwork_server.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectService {
    private final SubjectRepository subjectRepository;

    public List<MemberSubject> findAllSubject(int memberId){
        return subjectRepository.findAllSubject(memberId);
    }
    public Subject findSubject(int subjectId){
        return subjectRepository.findBySubjectId(subjectId);
    }

}
