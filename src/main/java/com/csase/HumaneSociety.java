package com.csase;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class HumaneSociety {
    /* This is the class for the Humane Society instance.
       The instance variables are the ArrayLists catList (where the cats are stored), and the
           dogList (where the dogs are stored).
       It has the following methods:
          * checkForCats
               * checks if the desired type of cat is at the Humane Society. If so, it returns the
                 number available
     */
    // Instance variables
    private List<Cats> catList;
    private List<Dogs> dogList;

    // Instantiate the instance variables
    public HumaneSociety(List<Cats> catList, List<Dogs> dogList) {
        this.catList = catList;
        this.dogList = dogList;
    }

    public Integer checkForCats(Cats catItem) {
        // Check if the cat is in the shelter. If so, return the number of them.
        for (int i = 0; i < catList.size(); i++) {
            if (catList.get(i).getType().equals(catItem.getType()) &&
                    catList.get(i).getGender().equals(catItem.getGender()) &&
                    catList.get(i).getColor().equals(catItem.getColor()) &&
                    catList.get(i).getAge().equals(catItem.getAge())) {
                // The cat is in the shelter so that we return the number of them
                return catList.get(i).getNumber();
            }
        }
        return 0; // Return 0 if no matching cat is found

    }

    public Integer checkForDogs(Dogs dogItem) {
        for (int i = 0; i < dogList.size(); i++) {
            if (dogList.get(i).getType().equals(dogItem.getType()) &&
                    dogList.get(i).getGender().equals(dogItem.getGender()) &&
                    dogList.get(i).getColor().equals(dogItem.getColor()) &&
                    dogList.get(i).getAge().equals(dogItem.getAge())&&
                    dogList.get(i).getBuild().equals(dogItem.getBuild())){
                // The cat is in the shelter so that we return the number of them
                return dogList.get(i).getNumber();
            }

        }
        return 0;
    }
}
