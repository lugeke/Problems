package chp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class URLifyTest {

    @Test
    public void urlify() {

        char[] url = "Mr John Smith    ".toCharArray();
        assertEquals("Mr%20John%20Smith", URLify.urlify(url, 13));

        url = "   ".toCharArray();
        assertEquals("%20", URLify.urlify(url, 1));
    }
}