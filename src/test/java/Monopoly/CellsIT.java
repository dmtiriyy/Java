package Monopoly;



import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class CellsIT {
    @Test
    public void functionInClassFieldDoesNotWork() throws MonopolyException {
        Houses houses = mock(Houses.class);
        when(houses.getCount()).thenReturn(1);

        Cells cells = new Cells("UA", MonopolyType.normal, houses);
        cells.buildHouse();

        assertEquals(cells.getHouseCount(), 1);

        verify(houses, times(2)).getCount();
    }
}
