package com.example.exceptions.repository;


import com.example.exceptions.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment,String>{
    List<Comment> findAllByCreatedBy(String cretedBy);
}
