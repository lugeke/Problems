package ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;

import java.util.stream.Stream;

public class Utils {

    private Utils() {
    }

    public static <T> Map<T, Long> frequencyMap(Stream<T> elements) {
        return elements.collect(
                groupingBy(
                        Function.identity(),
                        HashMap::new, // can be skipped
                        counting()
                )
        );
    }

    public static void swap(int[] ary, int i, int j) {
        int t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }

    // Implementing Fisher–Yates shuffle
    public static void shuffleArray(int[] ary)
    {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ary.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            swap(ary, i, index);
        }
    }
}
