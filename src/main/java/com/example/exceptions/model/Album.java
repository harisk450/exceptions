package com.example.exceptions.model;

import org.springframework.data.annotation.Id;


public class Album {

    @Id
    private String albumId;
    private String name;
    private String description;
    private String coverPicUrl;


    public Album(String albumId, String name, String description, String coverPicUrl) {
        this.albumId = albumId;
        this.name = name;
        this.description = description;
        this.coverPicUrl = coverPicUrl;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverPicUrl() {
        return coverPicUrl;
    }

    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
    }
}
