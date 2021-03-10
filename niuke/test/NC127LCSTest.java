import org.junit.Test;

import static org.junit.Assert.*;

public class NC127LCSTest {

    @Test
    public void LCS() {

        assertEquals("123", NC127LCS.LCS("123", "3435212346"));
        assertEquals("2345", NC127LCS.LCS("1AB2345CD", "12345EF"));
        assertEquals("", NC127LCS.LCS("123", "456"));

    }
}