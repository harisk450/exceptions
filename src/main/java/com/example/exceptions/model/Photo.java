package com.example.exceptions.model;

import com.example.exceptions.Valdiation.ValidName;
import org.springframework.data.annotation.Id;

public class Photo {
    @Id
    private String id;
    private int albumId;
    private String photoUrl;
    private String createdBy;
    @ValidName
    private String dateCreated;

    public Photo(String id, int albumId, String photoUrl, String createdBy, String dateCreated) {
        this.id = id;
        this.albumId = albumId;
        this.photoUrl = photoUrl;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
