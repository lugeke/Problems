package chp1;

import java.util.Map;
import java.util.function.Function;
import static java.util.stream.Collectors.*;

public class CheckPermutation {
    public static boolean isPermutation(String a, String b) {

        Map<Integer, Long> freqA = a.chars().boxed().collect(groupingBy(Function.identity(), counting()));
        Map<Integer, Long> freqB = b.chars().boxed().collect(groupingBy(Function.identity(), counting()));

        return freqA.equals(freqB);
    }
}
