package edu.miu.cs.cs427.blackpanther.model;

import java.util.Objects;

public class PetDTO {

    private Integer petID;
    private String type;
    private String breed;
    private String sex;
    private String color;
    private String weight;
    private String description;
    private String image;
    private String date;

    public PetDTO() {
    }

    public PetDTO(Integer petID) {
        this.petID = petID;
    }

    public PetDTO(Integer petID, String type, String breed, String sex, String color, String weight, String description, String date) {
        this.petID = petID;
        this.type = type;
        this.breed = breed;
        this.sex = sex;
        this.color = color;
        this.weight = weight;
        this.description = description;
//        this.image = image;
        this.date = date;
    }
    public PetDTO( String type, String breed, String sex, String color, String weight, String description, String date) {
        this.type = type;
        this.breed = breed;
        this.sex = sex;
        this.color = color;
        this.weight = weight;
        this.description = description;
        this.date = date;
    }

    public Integer getPetID() {
        return petID;
    }

    public void setPetID(Integer petID) {
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

    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetDTO petDTO = (PetDTO) o;
        return petID.equals(petDTO.petID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petID);
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "PetDTO{" +
                "petID=" + petID +
                ", type='" + type + '\'' +
                ", breed='" + breed + '\'' +
                ", sex='" + sex + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
