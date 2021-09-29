package com.example.exceptions.Service;


import com.example.exceptions.Repository.CommentRepository;
import com.example.exceptions.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Comment updateCommnet(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(String id) {
        commentRepository.deleteById(id);
    }

    public List<Comment> getCommentByCreator(String createdBy) {
        return commentRepository.findbyCreator(createdBy);
    }

    public Comment getCommentById(String id) {
        return commentRepository.findById(id).get();
    }
}
