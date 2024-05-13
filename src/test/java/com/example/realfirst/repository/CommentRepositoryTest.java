package com.example.realfirst.repository;

import com.example.realfirst.entity.Article;
import com.example.realfirst.entity.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CommentRepositoryTest {
    @Autowired
    CommentRepository commentRepository;
    @Test
    @DisplayName("특정 게시글의 모든 댓글 조회")
    void findByArticleId() {
        Long articleId = 1L;
        List<Comment> comments = commentRepository.findByArticleId(articleId);
        Article article = new Article(1L, "가가가", "111");
        List<Comment> expected = Arrays.asList();
        assertEquals(expected.toString(), comments.toString(), "4번 글의 모든 댓글을 출력!");
    }

    @Test
    @DisplayName("특정 닉네임의 모든 댓글 조회")
    void findByNickname() {
        String nickname = "Park";
        List<Comment> comments = commentRepository.findByNickname(nickname);
        Comment a = new Comment(2L, new Article(4L, "당신의 인생 영화는?", "댓글 고"), nickname, "굿 윌 헌팅");
        Comment b = new Comment(4L, new Article(5L, "당신의 소울 푸드는?", "댓글 고고"), nickname, "치킨");
        Comment c = new Comment(7L, new Article(6L, "당신의 취미는?", "댓글 고고고"), nickname, "조깅");
        List<Comment> expected = Arrays.asList(a,b,c);
        assertEquals(expected.toString(), comments.toString(), "Park의 모든 댓글을 출력!");
    }
}