package com.example.teamwork_server.domain;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Data
@Table(name = "member")
@ToString
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = IDENTITY) //autoincreament를 사용!
    private int memberId;

    @Column
    private String studentCode;
    @Column
    private String name;
    @Column
    private String phoneNumber;
    @Column
    private String address;

}
