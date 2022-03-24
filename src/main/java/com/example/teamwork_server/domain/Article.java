package com.example.teamwork_server.domain;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data //getter,setter 만듦
@Table(name = "board")
@NoArgsConstructor  // 생성자 만듦.
public class Article {
    @Id
    @GeneratedValue(strategy = IDENTITY) //autoincreament를 사용
    private int id;
    @Column
    private String title;
    @Column
    private int count;
    @Column
    private String name;
    @Column
    private String content;
    @Column
    private Date published_at;



}
