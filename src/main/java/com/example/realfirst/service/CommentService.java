package com.example.realfirst.service;

import com.example.realfirst.dto.CommentDto;
import com.example.realfirst.entity.Article;
import com.example.realfirst.entity.Comment;
import com.example.realfirst.repository.ArticleRepository;
import com.example.realfirst.repository.CommentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private ArticleRepository articleRepository;

    public List<CommentDto> comments(Long articleId) {
        return commentRepository.findByArticleId(articleId).stream().map(comment->CommentDto.createCommentDto(comment)).collect(Collectors.toList());
    }

    @Transactional
    public CommentDto create(Long articleId, CommentDto dto) {
        Article article = articleRepository.findById(articleId).orElseThrow(() -> new IllegalArgumentException("댓글 생성 실패! " + "대상 게시글이 없습니다."));
        Comment comment = Comment.createComment(dto, article);
        Comment created = commentRepository.save(comment);
        return CommentDto.createCommentDto(created);
    }

    @Transactional
    public CommentDto update(Long id, CommentDto dto) {
        Comment target = commentRepository.findById(id).orElseThrow( () -> new IllegalArgumentException("댓글 수정 실패!" + "대상 댓글이 없습니다."));
        target.patch(dto);
        Comment updated = commentRepository.save(target);
        return CommentDto.createCommentDto(updated);
    }

    public CommentDto delete(Long id) {
        Comment target = commentRepository.findById(id).orElseThrow( () -> new IllegalArgumentException("댓글 삭제 실패!" + "대상이 없습니다."));
        commentRepository.delete(target);
        return CommentDto.createCommentDto(target);
    }
}
