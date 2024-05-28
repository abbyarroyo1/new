package com.csase;

public class Dogs extends Animals{

    String build;//small, medium or large
    public Dogs(String type, String gender, String color, Integer age, Integer number, String build){
        super(type, gender, color, age, number);
        this.build = build;
    }

    // class constructor with no data
    public Dogs() {
        super();
        this.build="";
    }

    public String getBuild() {
        return build;
    }

}
