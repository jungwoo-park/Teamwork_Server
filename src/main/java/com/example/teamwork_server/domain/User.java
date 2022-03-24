package com.example.teamwork_server.domain;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Data
@Table(name = "user")
@NoArgsConstructor
public class User{
    @Id
    @GeneratedValue(strategy = IDENTITY) //autoincreament를 사용!
    private int userId;
    @Column
    private int schoolNumber;
    @Column
    private String name;
    @Column
    private String phoneNumber;

}
