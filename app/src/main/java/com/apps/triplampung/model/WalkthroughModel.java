package com.apps.triplampung.model;

public class WalkthroughModel {
    private String title,description;
    private int image;

    public WalkthroughModel(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public WalkthroughModel setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public WalkthroughModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getImage() {
        return image;
    }

    public WalkthroughModel setImage(int image) {
        this.image = image;
        return this;
    }
}
