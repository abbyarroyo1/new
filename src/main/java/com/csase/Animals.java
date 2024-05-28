package com.csase;

public class Animals {
    // This is the class for animals.
    // There is a subclass for cats and dogs. Dogs have an additional instance variable size.
    // instance variables
    String type;
    String gender; // F or M
    String color;
    Integer age;
    Integer number; // Number the animal with the characteristics in the Humane Society

    // class constructor with data
    public Animals(String type, String gender, String color, Integer age, Integer number) {
        this.type = type;
        this.gender = gender;
        this.color = color;
        this.age = age;
        this.number = number;
    }

    // class constructor with no data
    public Animals() {
        this.type = "";
        this.gender = "";
        this.color = "";
        this.age = 0;
        this.number = 0;
    }

    // getters
    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getNumber() {
        return number;
    }

    // setters
    public void setNumber(Integer number) {
        this.number = number;
    }
}

