package uk.ac.cornwallcollege.richardmorris.game;

public class Character {
    int health;
    int attack;
    int defence;
    int speed;
    int size;
    String name;

    public Character(int health, int attack, int defence, int speed, int size, String name) {
        this.health = health;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.size = size;
        this.name = name;
    }

    public void hit(Character c) {
        int rnd = (int)(Math.random() *10); // random number from 0 to 9

        if(rnd + attack > c.defence) {
            System.out.println(this.name + " sucessfully hits " + c.name);
            dealDamage(c, size * attack);
        } else {
            System.out.println(this.name + " misses " + c.name);
        }

    }

    /**
     * Overridden version of the Object's toString method.
     * An enxample of polymorphism.
     * @return
     */
    @Override
    public String toString() {
        return name + "\n" +
                "health=" + health + '\n' +
                ", attack=" + attack + '\n' +
                ", defence=" + defence + '\n' +
                ", speed=" + speed + '\n' +
                ", size=" + size +
                '}';
    }

    public void dealDamage(Character c, int amount) {
        c.health -= amount;
    }

}
