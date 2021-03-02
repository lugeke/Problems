package chp8;

public class RecursiveMultiply {


    static int multiply(int a, int b) {
        if (a == 1) return b;
        if ((a & 1) == 1) return multiply(a+1, b) - b;
        else return multiply(a >> 1, b << 1);
    }
}
