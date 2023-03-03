package uk.ac.cornwallcollege.richardmorris;

/**
 * A class used to represent someone name.
 * It allows various methods of presenting the name.
 */
public class Name {
    /**
     * Holds the first, or given name of the person.
     */
    String first;
    /**
     * Holds the last, or family name of the person.
     */
    String last;

    /** Constructor that builds the object given a name.
     * @param s The name in the format "Richard Morris"
     **/
    public Name(String s) {
        int pos = s.indexOf(' ');
        first = s.substring(0,pos);
        last = s.substring(pos+1);
    }

    /**
     * Returns a representation in Surname first order.
     * @return a String in the format "Morris, Richard"
     */
    public String reverseOrder() {
        return last + ", " + first;
    }

    /**
     * Returns a string representation
     * @return a String in the format "Richard Morris"
     */
    @Override
    public String toString() {
        return first + " " + last;
    }
}
