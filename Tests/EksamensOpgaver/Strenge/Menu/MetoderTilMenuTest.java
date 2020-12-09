package EksamensOpgaver.Strenge.Menu;

import org.junit.Test;

import static org.junit.Assert.*;

public class MetoderTilMenuTest {

    @Test
    public void plusToTal() {
        int sum = 0;
        int tal1 = 20;
        int tal2 = 10;

        int expected = 30;
        int actual = tal1+tal2;

        assertEquals(expected,actual);
    }
}