package chp8;


import ds.Utils;

import java.util.*;

public class PermutationsWithDups {
    private char[] chars;
    private Collection<String> result;

    public PermutationsWithDups(String str) {
        chars = str.toCharArray();
        result = new ArrayList<>();
    }

    public Collection<String> permutations() {
        permutation(chars, 0);
        return result;
    }

    private void permutation(char[] ary, int i) {
        if (i == ary.length - 1) {
            result.add(new String(ary));
        }

        for (int j = i; j < ary.length; j++) {
            if (!permutedEarlier(ary, i, j, ary[j])){
                swap(chars, j, i);
                permutation(ary, i + 1);
                swap(chars, j, i);
            }
        }
    }

    private boolean permutedEarlier(char[] nums, int start, int end, int value) {
        for (int i = start; i < end; i++)
            if (nums[i] == value) return true;
        return false;
    }

    private void swap(char[] ary, int i, int j) {
        if (i == j) return;
        char t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }
}

class PermutationsWithDupsC {
    private StringBuffer permutation;
    private Collection<String> result;
    private Map<Character, Long> map;

    public PermutationsWithDupsC(String str) {
        permutation = new StringBuffer(str.length());
        result = new ArrayList<>();
        map = Utils.frequencyMap(str.chars()
                .mapToObj(c -> (char) c));
    }

    public Collection<String> permutations() {
        permutation();
        return result;
    }

    private void permutation() {

        if (permutation.length() == permutation.capacity()) {
            result.add(permutation.toString());
        }

        for (Character c : map.keySet()) {
            long count = map.get(c);
            if (count > 0) {
                permutation.append(c);
                map.put(c, count - 1);
                permutation();
                permutation.setLength(permutation.length() - 1);// 模拟pop
                map.put(c, count);
            }
        }
    }

}
