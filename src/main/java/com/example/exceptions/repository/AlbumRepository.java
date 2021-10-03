package com.example.exceptions.repository;


import com.example.exceptions.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AlbumRepository extends MongoRepository<Album, String> {


    List<Album> findAllByName(String name);
}
