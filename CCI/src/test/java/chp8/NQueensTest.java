package chp8;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NQueensTest {

    @Test
    public void positions() {

        List<List<String>> positions = new NQueens(8).positions();
        System.out.println(positions);
        assertEquals(92, positions.size());
    }
}