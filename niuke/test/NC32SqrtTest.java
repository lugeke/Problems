import org.junit.Test;

import static org.junit.Assert.*;

public class NC32SqrtTest {

    @Test
    public void sqrt() {
        assertEquals(2, NC32Sqrt.sqrt(4));
        assertEquals(1, NC32Sqrt.sqrt(3));
        assertEquals(1, NC32Sqrt.sqrt(2));

        assertEquals(3, NC32Sqrt.sqrt(12));
        assertEquals(1, NC32Sqrt.sqrt(1));
        assertEquals(38974, NC32Sqrt.sqrt(1518991037));
    }
}