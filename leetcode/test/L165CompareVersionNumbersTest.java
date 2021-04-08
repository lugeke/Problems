import org.junit.Test;

import static org.junit.Assert.*;

public class L165CompareVersionNumbersTest {

    @Test
    public void compareVersion() {

        assertEquals(0, L165CompareVersionNumbers.compareVersion("1.01", "1.001"));
        assertEquals(0, L165CompareVersionNumbers.compareVersion("1.0", "1.0.0"));
        assertEquals(-1, L165CompareVersionNumbers.compareVersion("0.1", "1.1"));
        assertEquals(1, L165CompareVersionNumbers.compareVersion("1.0.1", "1"));
        assertEquals(-1, L165CompareVersionNumbers.compareVersion("7.5.2.4", "7.5.3"));
    }
}