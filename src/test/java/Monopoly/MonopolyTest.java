package Monopoly;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class MonopolyTest {
    @Test
    public void fieldsInTheClassAreFilledIncorrectly() throws MonopolyException {
        Monopoly myMono1 = new Monopoly(new ArrayList<>(), "Monopoly1", MonopolyType.normal);
        Monopoly myMono2 = new Monopoly(new ArrayList<>(), "Monopoly2", MonopolyType.extended);

        Players.Player player1 = new Players.Player("red", 1);
        Players.Player player2 = new Players.Player("blue", 2);

        assertEquals("red", player1.getColor());
        assertEquals(1500, player1.getMoney());
        assertNotEquals("yellow", player1.getColor());
        assertNotEquals(player1.getId(), player2.getId());

        assertSame("Monopoly1", myMono1.getName());
    }
}
