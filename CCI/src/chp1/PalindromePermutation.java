package chp1;

import java.util.Map;

import static java.util.stream.Collectors.*;

public class PalindromePermutation {

    public static boolean isPalindromePermutation(String s) {

        Map<Integer, Long> freq =  s.chars().boxed()
                .filter(Character::isLetter)
                .collect(groupingBy(Character::toLowerCase, counting()));

        int oddCnt = 0;
        for (Long c: freq.values()) {
            if (c % 2 == 1) oddCnt++;
            if (oddCnt > 1) return false;
        }

        return true;
    }
}
