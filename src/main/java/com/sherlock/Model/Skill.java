package com.sherlock.Model;

public class Skill {

    private String Name;
    private int ratingOutOf10;
    private String Category;

    public Skill(String name, int ratingOutOf10, String Category) {
        Name = name;
        this.ratingOutOf10 = ratingOutOf10;
        this.Category =  Category;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRatingOutOf10() {
        return ratingOutOf10;
    }

    public void setRatingOutOf10(int ratingOutOf10) {
        this.ratingOutOf10 = ratingOutOf10;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

}
