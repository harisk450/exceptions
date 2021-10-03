package com.example.exceptions.resource;


import com.example.exceptions.model.Photo;
import com.example.exceptions.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
public class PhotoResource {

    @Autowired
    private PhotoService photoService;

    @ExceptionHandler(NoSuchElementException.class)
    public String noSuchElementError(){
        return "No Such Element Found";
    }

    @PostMapping("/photo")
    public Photo savePhoto(@RequestBody Photo photo){
        return photoService.savePhoto(photo);
    }


    @GetMapping("/photos")
    public List<Photo> getAllPhotos(){
        return photoService.getAllPhotos();
    }

    @GetMapping
    public List<Photo> getPhotoByCreator(@RequestParam(name = "craetedBy") String  createdBy){
        return photoService.getPhotoByCreator(createdBy);
    }

    @PutMapping("/photo/{photoId}")
    public Photo updatePhoto(@RequestBody Photo photo){
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping("/photo")
    public void deletePhoto(@RequestParam(name = "Id") String id){
        photoService.deletePhoto(id);
    }
}
