package ds;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SortTest {

    @Parameterized.Parameters
    public static Iterable<Consumer<int[]>> data() {
        return Arrays.asList(MergeSort::mergeSort
                , QuickSort::sort
        );
    }

    private final Consumer<int[]> sortMethod;

    public SortTest(Consumer<int[]> sortMethod) {
        this.sortMethod = sortMethod;
    }

    @Test
    public void testSort() {
        int[] sorted = IntStream.range(0, 100).toArray();
        int[] array = IntStream.range(0, 100).toArray();

        for (int i = 0 ; i < 100; i++) {
            Utils.shuffleArray(array);
//            System.out.println(Arrays.toString(array));

            sortMethod.accept(array);
            assertArrayEquals(sorted, array);
        }

    }
}