package com.example.teamwork_server.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(name = "subject")
@NoArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int subjectId;
    @Column
    private String subjectName;
    @Column
    private String professiorName;
    @Column
    private Date startDate;
    @Column
    private Date endDate;
}
