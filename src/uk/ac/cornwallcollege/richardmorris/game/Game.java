package uk.ac.cornwallcollege.richardmorris.game;

public class Game {

    public static void main(String[] args) {

        Character c1 = new Character(10,5,4,1,2,"Zorro");
        System.out.println(c1.toString());
        Character c2 = new PlayableCharacter(5,6,7,8,9,"Safdari");
        System.out.println(c2);
        Character c3 = new NPC(1,2,3,4,5,"Joe Hill");
        System.out.println(c3);
        Character c4 = new TeamRocket(1,2,3,4,5,"Rockets");
        System.out.println(c4);

    }
}
