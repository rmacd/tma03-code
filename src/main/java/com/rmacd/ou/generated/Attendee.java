package com.rmacd.ou.generated;

public class Attendee extends Person {

    private String biography;
    private Photo photo;

    public String getBiography() {
        return this.biography;
    }

    /**
     * @param biography
     */
    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Photo getPhoto() {
        return this.photo;
    }

    /**
     * @param photo
     */
    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
}