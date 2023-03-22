package uk.ac.cornwallcollege.richardmorris.game;

public class PlayableCharacter extends Character {

    String mood;
    int experience;



    public PlayableCharacter(int health, int attack, int defence, int speed, int size, String name) {
        super(health, attack, defence, speed, size, name);
    }

    @Override
    public String toString() {
        return name + " health: " + health + " mood "+ mood;
    }
}
