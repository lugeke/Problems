import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

class O15ReorderTest {

    @Test
    public void testEvenOdd() {
        int[] ary = new int[] {1,2,3,4,5,6,7};
        Predicate<Integer> isEven = x -> x % 2 == 0;
        O15Reorder.reorder(ary, isEven);

        testReordered(ary, isEven);
    }

    @Test
    public void testNegativePositive() {
        int[] ary = new int[] {-1,2,-3,-4,-5,6,7};
        Predicate<Integer> isPositive = x -> x > 0;
        O15Reorder.reorder(ary, isPositive);

        testReordered(ary, isPositive);
    }

    private void testReordered(int[] ary, Predicate<Integer> belongFirstPart) {
        boolean beginSecondPart = false;
        for (int j : ary) {
            if (beginSecondPart) Assertions.assertFalse(belongFirstPart.test(j));
            if (!belongFirstPart.test(j)) beginSecondPart = true;
        }
    }
}