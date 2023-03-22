package uk.ac.cornwallcollege.richardmorris.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void testCharacterCreation() {
        Character c1 = new Character(50,15, 20, 5, 1, "ZORRO");

    }

    @Test
    public void testPlayableCharacterCreation() {
        PlayableCharacter c1 = new PlayableCharacter(50,15, 20, 5, 1, "ZORRO");
        assertEquals(0,c1.experience);
    }

    @Test
    public void testHitting() {
        Character c1 = new Character(50,15, 20, 5, 1, "ZORRO");

        Character c2 = new Character(50,15, 0, 5, 1, "sheep");

        c1.hit(c2);
        assertEquals(35, c2.health);
        System.out.println("Test successfully passed health is "+c2.health);
    }
}
