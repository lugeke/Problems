import java.sql.SQLOutput;

public class O11Power {

    public static double power(double base, int exponent) {
        if (equal(base, 0.0) && exponent < 0) throw new ArithmeticException();

        int absExponent = exponent < 0 ? -exponent : exponent;
        double result = powerWithUnsignedExponent(base, absExponent);
        if (exponent < 0) result = 1 / result;

        return result;
    }

    private static double powerWithUnsignedExponent(double base, int exponent) {
        if (exponent == 0) return 1;
        else if (exponent == 1) return base;

        double result = powerWithUnsignedExponent(base, exponent >> 1);
        result *= result;
        if ((exponent & 0x1) == 1) result *= base;

        return result;
    }

    private static boolean equal(double num1, double num2) {
        return Math.abs(num1-num2) < 0.0000001;
    }
}
