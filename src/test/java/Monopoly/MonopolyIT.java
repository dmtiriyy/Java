package Monopoly;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MonopolyIT {
    @Test
    void spyMushrooms_AddMushroomToMushrooms() {
        ArrayList<Parts> list = Mockito.spy(new ArrayList<>());
        Monopoly mp;
        try {
            mp = new Monopoly(list, "mp", MonopolyType.normal);
            Parts ps = new Bank("theme", new Players("theme", new ArrayList<>()));

            mp.addPart(ps);

            Mockito.verify(list).add(ps);
        } catch (MonopolyException e) {
            e.printStackTrace();
        }
    }
}
