package com.example.exceptions.Resource;


import com.example.exceptions.Service.PhotoService;
import com.example.exceptions.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/photos")
public class PhotoResource {
    @Autowired
    private PhotoService photoService;

    @PostMapping
    public Photo savePhoto(@RequestBody Photo photo){
        return photoService.savePhoto(photo);
    }

    @GetMapping
    public List<Photo> getAllPhotos(){
        return photoService.getAllPhotos();
    }

    @PutMapping
    public Photo updatePhoto(@RequestBody Photo photo){
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping
    public void deletePhoto(@RequestParam(name = "id") String id){
        photoService.deletePhoto(id);
    }

    @GetMapping
    public List<Photo> getPhotoByCreator(@RequestParam(name = "createdBy") String createdBy){
        return photoService.getPhotoByCreator(createdBy);
    }
    @ExceptionHandler(NoSuchElementException.class)
    public String noSuchElementError(){
        return "No Such Element Found";
    }


    @GetMapping
    public Photo getPhotoById(@RequestParam(name = "id") String id){
        return photoService.getPhotoById(id);
    }
}
