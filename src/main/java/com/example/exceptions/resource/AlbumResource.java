package com.example.exceptions.resource;



import com.example.exceptions.model.Album;
import com.example.exceptions.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RequestMapping("/api")
@RestController
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public String noSuchElementError(){
        return "No Such Element Found";
    }


    @GetMapping("/albums")
    public List<Album> getAllAlbums(){
        return albumService.getAllAlbums();
    }

    @GetMapping("/album/{albumName}")
    public List<Album> getAlbumByName(@RequestParam(name = "name") String name){
        return albumService.getAlbumByName(name);
    }

    @PutMapping("/album/{albumId}")
    public Album updateAlbum(@RequestBody Album album){
        return albumService.updateAlbum(album);
    }

    @DeleteMapping("/album")
    public void deleteAlbum(@RequestParam(name = "albumId") String albumId){
        albumService.deleteAlbum(albumId);

    }

}

