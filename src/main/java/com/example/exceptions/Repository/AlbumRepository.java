package com.example.exceptions.Repository;


import com.example.exceptions.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AlbumRepository extends MongoRepository<Album,String> {
    List<Album> findAllByCreator(String createdBy);


}
