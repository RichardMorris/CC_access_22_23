package uk.ac.cornwallcollege.richardmorris;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Main program.
 */
public class Hello3 {

    /**
     * Method called when program starts.
     * @param args set of arguments to the program, not used here
     */
    public static void main(String[] args) {
        // A list of names
        List<String> myList = new ArrayList<>();
        // A list of names in surfname first order
        List<String> surnameFirst = new ArrayList<>();
        // Add some names
        myList.add("Richard Morris");
        myList.add("Kevin Bruford");
        myList.add("Stanton Martin");
        // Loop through the list
        for(var s : myList) {
            // Create a name object
            Name cur = new Name(s);
            // Find the revesed version of the name
            String reversed = cur.reverseOrder();
            // Add to list
            surnameFirst.add(reversed);
        }

        // Sort the list
        Collections.sort(surnameFirst);
        // Loop through the second list
        for(var s : surnameFirst) {
            // print it out
            System.out.println(s);
        }
    }
}
