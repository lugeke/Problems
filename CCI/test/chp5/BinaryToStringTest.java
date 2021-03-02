package chp5;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryToStringTest {

    @Test
    public void printBinary() {

        assertEquals(".101", BinaryToString.printBinary(0.625));
        assertEquals("ERROR", BinaryToString.printBinary(0.1));

        assertEquals(".11101", BinaryToString.printBinary(0.90625));
    }
}