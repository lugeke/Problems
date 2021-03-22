import org.junit.Test;

import static org.junit.Assert.*;

public class L151ReverseWordsInAStringTest {

    @Test
    public void reverseWords1() {
        String reverse = L151ReverseWordsInAString.reverseWords("the sky is blue");
        assertEquals("blue is sky the", reverse);
    }

    @Test
    public void reverseWords2() {
        String reverse = L151ReverseWordsInAString.reverseWords("  hello world  ");
        assertEquals("world hello", reverse);
    }

    @Test
    public void reverseWords3() {
        String reverse = L151ReverseWordsInAString.reverseWords("a good   example");
        assertEquals("example good a", reverse);
    }

    @Test
    public void reverseWords4() {
        String reverse = L151ReverseWordsInAString.reverseWords("  Bob    Loves  Alice   ");
        assertEquals("Alice Loves Bob", reverse);
    }

    @Test
    public void reverseWords5() {
        String reverse = L151ReverseWordsInAString.reverseWords("Alice does not even like bob");
        assertEquals("bob like even not does Alice", reverse);
    }
}