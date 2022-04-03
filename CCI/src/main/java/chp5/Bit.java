package chp5;

public class Bit {

    private Bit() {}


    static boolean get(int num, int i) {
        return (num & (1 << i)) != 0;
    }

    static int set(int num, int i) {
        return num | (1 << i);
    }

    static int clear(int num, int i) {
        int mask = ~(1 << i);
        return num & mask;
    }

    // Clear all bits from the most significant bit through i(inclusive)
    static int clearMSBthroughI(int num, int i) {
        int mask = ( 1 << i) - 1;
        return num & mask;
    }

    // Clear all bits from i through 0(inclusive)
    static int clearIThrough0(int num, int i) {
        int mask = -1 << (i+1);
        return num & mask;
    }

    static int update(int num, int i, boolean bitIs1) {
        int value = bitIs1 ? 1 : 0;
        int mask = ~(1 << i);
        return (num & mask) | (value << i);
    }
}
