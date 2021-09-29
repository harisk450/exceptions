package com.example.exceptions.Resource;


import com.example.exceptions.Service.CommentService;
import com.example.exceptions.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/comments")
public class CommentResource {
    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping
    public List<Comment> getAllComments(){
        return  commentService.getAllComments();
    }

    @PutMapping
    public Comment updateComment(@RequestBody Comment comment){
        return commentService.updateCommnet(comment);
    }

    @DeleteMapping
    public void deleteComment(@RequestParam(name = "id") String id){
        commentService.deleteComment(id);
    }

    @GetMapping
    public List<Comment> getCommentByCreator(@RequestParam(name = "createdBy") String createdBy){
        return commentService.getCommentByCreator(createdBy);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public String noSuchElementError(){
        return "No Such Element Found";
    }


    @GetMapping
    public Comment getCommentById(@RequestParam(name = "id") String id){
        return commentService.getCommentById(id);
    }

}
