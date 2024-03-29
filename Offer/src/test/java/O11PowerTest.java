import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class O11PowerTest {

    private static Object[] testData() {
        return new Object[]{
                new Object[]{2, 0, 1},
                new Object[]{2, 3, 8},
                new Object[]{2, -2, 0.25},

                new Object[]{-2, 0, 1},
                new Object[]{-2, 3, -8},
                new Object[]{-2, -2, 0.25}
        };
    }

    @Test
    @Parameters(method = "testData")
    public void power(double base, int exponent, double result) {
        assertEquals(result, O11Power.power(base, exponent), 0.0000001);
    }

    @Test(expected = ArithmeticException.class)
    public void powerThrowArithmeticException() {
        O11Power.power(0, -4);
    }
}