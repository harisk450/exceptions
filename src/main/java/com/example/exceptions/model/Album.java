package com.example.exceptions.model;

import com.example.exceptions.Valdiation.ValidName;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Max;

public class Album {

    @Id
    private String albumId;
    @Max(value = 10)
    private String name;
    private String coverPicUrl;
    @ValidName
    private String createdBy;
    private String dateCreated;

    public Album(String albumId, String name, String coverPicUrl, String createdBy, String dateCreated) {
        this.albumId = albumId;
        this.name = name;
        this.coverPicUrl = coverPicUrl;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPicUrl() {
        return coverPicUrl;
    }

    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
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
