import org.junit.Test;

import static org.junit.Assert.*;

public class O4ReplaceBlankTest {

    @Test
    public void replaceBlank() {

        assertEquals("We%20are%20happy.", O4ReplaceBlank.replaceBlank("We are happy."));
        assertEquals("Wearehappy.", O4ReplaceBlank.replaceBlank("Wearehappy."));
        assertEquals("%20", O4ReplaceBlank.replaceBlank(" "));
        assertEquals("", O4ReplaceBlank.replaceBlank(""));
        assertEquals("%20%20", O4ReplaceBlank.replaceBlank("  "));
    }
}