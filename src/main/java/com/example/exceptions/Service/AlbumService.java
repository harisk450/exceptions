package com.example.exceptions.Service;



import com.example.exceptions.Repository.AlbumRepository;
import com.example.exceptions.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;

    public Album saveAlbum(Album album) {
        return albumRepository.save(album);
    }

    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    public Album updateAlbum(Album album) {
        return albumRepository.save(album);
    }


    public void deleteAlbum(String albumId) {
         albumRepository.deleteById(albumId);
    }

    public List<Album> getAlbumByCreator(String createdBy) {
        return albumRepository.findAllByCreator(createdBy);
    }

    public Album getAlbumById(String albumId) {
        return albumRepository.findById(albumId).get();
    }
}
