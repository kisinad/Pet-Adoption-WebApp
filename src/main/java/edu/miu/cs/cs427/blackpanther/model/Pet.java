package edu.miu.cs.cs427.blackpanther.model;

public class Pet {
    private String petID;
    private String type;
    private String breed;
    private String sex;
    private String color;
    private String weight;
    private String description;
    private String image;

    public Pet() {
    }

    public Pet(String petID, String type, String breed, String sex, String color, String weight, String description, String image) {
        this.petID = petID;
        this.type = type;
        this.breed = breed;
        this.sex = sex;
        this.color = color;
        this.weight = weight;
        this.description = description;
        this.image = image;
    }

    public String getPetID() {
        return petID;
    }

    public void setPetID(String petID) {
        this.petID = petID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
