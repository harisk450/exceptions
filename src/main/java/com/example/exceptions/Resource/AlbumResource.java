package com.example.exceptions.Resource;


import com.example.exceptions.Service.AlbumService;
import com.example.exceptions.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/albums")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @ExceptionHandler(NoSuchElementException.class)
    public String noSuchElementError(){
        return "No Such Element Found";
    }

    @PostMapping
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }

    @GetMapping
    public List<Album> getAllAlbums(){
        return albumService.getAllAlbums();
    }

    @PutMapping
    public Album updateAlbum(@RequestBody Album album){
        return albumService.updateAlbum(album);
    }

    @DeleteMapping
    public void deleteAlbum(@RequestParam(name = "albumId") String albumId){
        albumService.deleteAlbum(albumId);
    }

    @GetMapping
    public List<Album> getAlbumByCreator(@RequestParam(name = "createdBy") String createdBy){
        return albumService.getAlbumByCreator(createdBy);
    }

    @GetMapping
    public Album getAlbumById(@RequestParam(name = "albumId") String albumId){
        return albumService.getAlbumById(albumId);
    }
}
