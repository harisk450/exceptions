package com.example.exceptions.service;


import com.example.exceptions.model.Album;
import com.example.exceptions.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;


    public Album saveAlbum(@RequestBody Album album) {
        return albumRepository.save(album);
    }

    public List<Album> getAllAlbums() {
        return albumRepository.findAll();

    }

    public List<Album> getAlbumByName(String name) {
        return albumRepository.findAllByName(name);
    }

    public Album updateAlbum( Album album) {
        return albumRepository.save(album);
    }

    public void deleteAlbum(String albumId) {
        albumRepository.deleteById(albumId);
    }
}
