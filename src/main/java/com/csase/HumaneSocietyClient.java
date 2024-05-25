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

        //Read data from Excel into the ArrayLists
        ReadExcelData.readDataForArrayLists(catList);

        /* // Below is the original code to create a cat instance before reading in Excel.
        // Create some cat instances
        String type = "CAT";
        String gender = "F";
        String color = "BLACK";
        Integer age = 1;
        Integer number = 5;

        Cats newCatItem = new Cats(type, gender, color, age, number);
        catList.add(newCatItem); */

        // Create the HumaneSociety and add the cats
        HumaneSociety HumaneSocietyInstance = new HumaneSociety(catList);

        // Check if a cat type exists
        String type = "CAT";
        String gender = "F";
        String color = "BLACK";
        Integer age = 1;

        Cats searchCat = new Cats(type, gender, color, age, 0); // Number is not relevant for search
        Integer availableCats = HumaneSocietyInstance.checkForCats(searchCat);
        System.out.println("Number of available cats: " + availableCats);
    }
}
