package chp8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.IntStream;

public class PermutationsWithoutDups {

    private char[] chars;
    private Collection<String> result;

    public PermutationsWithoutDups(String str) {
        chars = str.toCharArray();
        int count = IntStream.rangeClosed(2, str.length()).reduce(1, (x, y) -> x * y);
        result = new ArrayList<>(count);
    }

    public Collection<String> permutations() {
        permutation(chars, 0);
        return result;
    }

    private void permutation(char[] ary, int i) {
        if (i == ary.length-1) {
            result.add(new String(ary));
        }

        for (int j = i; j < ary.length; j++) {
            swap(chars, j, i);
            permutation(ary, i+1);
            swap(chars, j, i);
        }
    }

    private void swap(char[] ary, int i , int j) {
        if (i == j) return;
        char t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }
}
