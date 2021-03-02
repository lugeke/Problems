package chp13;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.stream.Collectors.toList;

public class LambdaRandom {

    static List<Integer> getRandomSubset(List<Integer> list) {
        return list.stream()
                .filter(i -> ThreadLocalRandom.current().nextBoolean())
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println(getRandomSubset(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)));
    }
}
