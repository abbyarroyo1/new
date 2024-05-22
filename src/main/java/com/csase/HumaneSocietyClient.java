package com.csase;

import java.util.ArrayList;
import java.util.List;

// HumaneSocietyClient class
public class HumaneSocietyClient {
    // This is the client where I run the code. It does the following:
    // * Creates the ArrayLists for the cats (and eventually dogs) in the Humane Society
    // * Creates a HumaneSociety instance where theses ArrayLists are instantiated in the HumaneSociety instance

    public static void main(String[] args) {

        // Create the HumaneSociety instance and add the Excel data
        // Create the ArrayLists for the cats in the Humane Society
        List<Cats> catList = new ArrayList<>();
        // TODO for dogs

        //TODO Read data from Excel into the ArrayLists
        // Create some cat instances
        String type = "CAT";
        String gender = "F";
        String color = "BLACK";
        Integer age = 1;
        Integer number = 5;

        Cats newCatItem = new Cats(type, gender, color, age, number);
        catList.add(newCatItem);

        System.out.println(catList.get(0).getType());

        // Create the HumaneSociety and add the cats
        HumaneSociety HumaneSocietyInstance = new HumaneSociety(catList);

        // Check if a cat type exists
        // Start with the same cat that we just entered
        Cats searchCat = new Cats(type, gender, color, age, 0); // Number is not relevant for search
        Integer availableCats = HumaneSocietyInstance.checkForCats(searchCat);
        System.out.println("Number of available cats: " + availableCats);
    }
}
