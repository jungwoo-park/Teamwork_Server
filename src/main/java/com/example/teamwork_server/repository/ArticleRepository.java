package com.example.teamwork_server.repository;
import com.example.teamwork_server.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository // 게시글 조회.
public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findByGroupsIdOrderByCreatedAtAsc(int groupsId);   // 생성일 오름차순으로 정렬.
    @Transactional
    @Modifying
    @Query(value = "update article set count=?1 where article_id=?2", nativeQuery = true)
    void updateCount(int count,int articleId);
    Article findByArticleId(int articleId);
}



// article 생성
// DB에 관여하는 것들은 repository 나 service에서 해줌.
// 상세 페이지 조회
// 상세 페이지 수정
// 상세 페이지 삭제




