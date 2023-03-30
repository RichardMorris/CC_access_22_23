package uk.ac.cornwallcollege.richardmorris.game;

public class TeamRocket extends  NPC {

    public TeamRocket(int health, int attack, int defence, int speed, int size, String name) {
        super(health, attack, defence, speed, size, name);
    }

    /**
     * A customises toString method
     * @return
     */
    @Override
    public String toString() {
        return "Go TeamRocket";
    }

    @Override
    public void dealDamage(Character c, int amount) {
        c.health -= attack;

        c.health -= attack;


    }
}
