package com.example.teamwork_server.service;


import com.example.teamwork_server.domain.Subject;
import com.example.teamwork_server.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectService {
    private final SubjectRepository subjectRepository;

    public List<Subject> findAllSubject(){
        return subjectRepository.findAll();
    }
    public Subject findSubject(int subjectId){
        return subjectRepository.findBySubjectId(subjectId);
    }

}
