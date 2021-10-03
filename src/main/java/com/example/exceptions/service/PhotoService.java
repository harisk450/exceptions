package com.example.exceptions.service;


import com.example.exceptions.model.Photo;
import com.example.exceptions.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepository;

    public Photo savePhoto(Photo photo) {
        return photoRepository.save(photo);
    }


    public List<Photo> getAllPhotos() {
        return photoRepository.findAll();
    }

    public List<Photo> getPhotoByCreator(String createdBy) {
        return photoRepository.findAllByCreatedBy(createdBy);
    }

    public Photo updatePhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    public void deletePhoto(String id) {
        photoRepository.deleteById(id);
    }
}
