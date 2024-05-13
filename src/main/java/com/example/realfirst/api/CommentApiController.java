package com.example.realfirst.api;

import com.example.realfirst.dto.CommentDto;
import com.example.realfirst.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class CommentApiController {
    @Autowired
    private CommentService commentService;
    @GetMapping("/api/articles/{articleId}/comments")
    public ResponseEntity<List<CommentDto>> comments(@PathVariable Long articleId){
        List<CommentDto> dtos = commentService.comments(articleId);
        return ResponseEntity.status(HttpStatus.OK).body(dtos);
        //엔티티가 아닌 DTO를 이용해 리턴하는 이유는 엔티티에는 두번째 속성의 타입이 Article이고, dto는 Long이기 때문
    }

    @PostMapping("/api/articles/{articleId}/comments")
    public ResponseEntity<CommentDto> create(@PathVariable Long articleId, @RequestBody CommentDto dto){
        CommentDto createdDto = commentService.create(articleId, dto);
        return ResponseEntity.status(HttpStatus.OK).body(createdDto);
    }

    @PatchMapping("/api/comments/{id}")
    public ResponseEntity<CommentDto> update(@PathVariable Long id, @RequestBody CommentDto dto){
        CommentDto updatedDto = commentService.update(id, dto);
        return ResponseEntity.status(HttpStatus.OK).body(updatedDto);
    }

    @DeleteMapping("/api/comments/{id}")
    public ResponseEntity<CommentDto> delete(@PathVariable Long id){
        CommentDto deletedDto = commentService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(deletedDto);
    }
}
