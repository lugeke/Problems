package chp1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    public static boolean isUnique(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++)
            if (!set.add(s.charAt(i)))
                return false;

        return true;
    }

    public static boolean isUnique1(String s) {
        char[] ary = s.toCharArray();
        Arrays.sort(ary);
        for (int i = 1; i < ary.length; i++)
            if (ary[i] == ary[i-1])
                return false;
        return true;
    }
}
