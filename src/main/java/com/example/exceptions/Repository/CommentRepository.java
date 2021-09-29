package com.example.exceptions.Repository;


import com.example.exceptions.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment,String> {

    List<Comment> findbyCreator(String createdBy);


}
