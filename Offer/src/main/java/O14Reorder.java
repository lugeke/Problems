import ds.Utils;

import java.util.function.Predicate;

public class O14Reorder {

    /**
     * reorder the ary by belongFirstPart standard
     * @param ary
     * @param belongFirstPart
     */
    public static void reorder(int[] ary, Predicate<Integer> belongFirstPart) {

        // invariant
        // ary[0..<i] belong to first part
        // ary[i..<j] belong to second part
        // ary[j..<ary.length] undefined

        int i = 0, j = 0;
        for (int k = j; k < ary.length; k++) {
            if (belongFirstPart.test(ary[k])) {
                Utils.swap(ary, i++, k);
            }
        }
    }



}
