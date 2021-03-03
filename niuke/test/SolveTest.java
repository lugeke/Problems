import org.junit.Test;

import static org.junit.Assert.*;

public class SolveTest {

    @Test
    public void solve() {

        assertEquals("3", Solve.solve("1", "2"));
        assertEquals("11", Solve.solve("9", "2"));
        assertEquals("11", Solve.solve("009", "0002"));
        assertEquals("33", Solve.solve("11", "22"));
        assertEquals("3", Solve.solve("001", "0000002"));
        assertEquals("100000", Solve.solve("99999", "1"));


        assertEquals("0", Solve.solve("000", "00"));
    }
}