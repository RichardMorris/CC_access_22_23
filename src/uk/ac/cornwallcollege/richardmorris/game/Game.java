package uk.ac.cornwallcollege.richardmorris.game;

import java.util.Scanner;

/**
 * A simple main method for the game, allows the creation of various types of character
 */
public class Game {

    public static void main(String[] args) {
        // sets up the input
        Scanner scan = new Scanner(System.in);
        // prints welcome message
        System.out.println("Please select first character\n1 for a Playable Character\n2 for a NPC\n3 for Team Rocket");
        // Reads a number from the console
        int choice = scan.nextInt();
        // Variable used to store the character,
        // note how we use the super-class variable here
        Character c1;
        // Take different paths depending on choice variable
        switch (choice) {
            case 1:
                c1 = new PlayableCharacter(5,6,7,8,9,"Safdari");
                break;
            case 2:
                c1 = new NPC(1,2,3,4,5,"Joe Hill");
                break;
            case 3:
                c1 = new TeamRocket(1,2,3,4,5,"Rockets");
                break;
            default: // this branch is taken if none of the other branches are followed
                c1 = new NPC(1,2,3,4,5,"Joe Hill");
        }
        // print out what we have created
        // it will use the overridden toString methods
        System.out.println("The first character is "+c1);
    }
}
