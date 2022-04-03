package chp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRotationTest {

    @Test
    public void isRotation() {
        assertTrue(StringRotation.isRotation("", ""));
        assertTrue(StringRotation.isRotation("erbottlewat", "waterbottle"));

        assertFalse(StringRotation.isRotation("erbottlewatz", "waterbottle"));
    }



}