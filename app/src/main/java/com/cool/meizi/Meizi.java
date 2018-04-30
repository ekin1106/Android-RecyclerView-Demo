package com.cool.meizi;

public class Meizi {

    private String imageUrl;
    private String title;
    private String name;
    private int favorites;
    private int comments;

    Meizi(String imageUrl, String title, String name, int favorites, int comments) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.name = name;
        this.favorites = favorites;
        this.comments = comments;
    }

    String getImageUrl() { return imageUrl; }
    public String getTitle() {
        return title;
    }
    public String getName() {
        return name;
    }
    int getFavorites() {
        return favorites;
    }
    int getComments() {
        return comments;
    }
}
