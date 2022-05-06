package com.example.teamwork_server.domain;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data //getter,setter 만듦
@Table(name = "article")
@NoArgsConstructor  // 생성자 만듦.
public class Article {
    @Id
    @GeneratedValue(strategy = IDENTITY) //autoincreament를 사용
    private int articleId;
    @Column
    private int groupsId;
    @Column
    private String articleTitle;
    @Column
    private String content;
    @Column
    private int memberId;
    @Column
    private int count;
    @Column
    private Date createdAt;
    @Column
    private Date updatedAt;
    @Column
    private Date deletedAt;


}
