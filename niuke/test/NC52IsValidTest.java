import org.junit.Test;

import static org.junit.Assert.*;

public class NC52IsValidTest {

    @Test
    public void isValid() {

        assertTrue(NC52IsValid.isValid("[]"));
        assertFalse(NC52IsValid.isValid("[]]"));
        assertTrue(NC52IsValid.isValid("[{()}]"));
        assertFalse(NC52IsValid.isValid("[{()}][)"));
    }
}