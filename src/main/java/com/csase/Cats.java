package com.csase;

public class Cats extends Animals {
    // This is the class for cats. It doesn't have any new instance variables like dogs, which have the
    //     additional instance variable of size

    public Cats(String type, String gender, String color, Integer age, Integer number){
        super(type, gender, color, age, number);
    }

    // class constructor with no data
    public Cats() {
        super();
    }

}
