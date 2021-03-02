package chp8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class ParensTest {

    @Test
    public void validParentheses1() {

        List<String> parens = new Parens(1).parentheses();
        assertEquals(new HashSet<>(Arrays.asList("()")),
                new HashSet<>(parens));
    }


    @Test
    public void validParentheses2() {

        List<String> parens = new Parens(2).parentheses();
        assertEquals(new HashSet<>(Arrays.asList("(())", "()()")),
                new HashSet<>(parens));
    }

    @Test
    public void validParentheses3() {

        List<String> parens = new Parens(3).parentheses();
        assertEquals(new HashSet<>(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()")),
               new HashSet<>(parens));
    }
}