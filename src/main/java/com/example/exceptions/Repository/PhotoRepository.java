package com.example.exceptions.Repository;


import com.example.exceptions.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PhotoRepository extends MongoRepository<Photo,String> {

    List<Photo> findByCreator(String createdBy);


}
