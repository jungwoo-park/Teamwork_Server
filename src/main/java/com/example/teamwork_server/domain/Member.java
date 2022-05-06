package com.example.teamwork_server.domain;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Data
@Table(name = "member")
@NoArgsConstructor
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
