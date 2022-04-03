package chp1;

public class OneAway {
    public static boolean isOneEditAway(String a, String b) {
        if (a.length() < b.length()) return isOneEditAway(b, a);
        if (a.length() - b.length() > 1) return false;

        // a.length >= b.length
        int editCnt = 0;
        for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
            if (a.charAt(i) != b.charAt(j)) {
                if (a.length() == b.length()) editCnt++;
                else j--; // must insert
            }
            if (editCnt > 1) return false;
        }
        return true;
    }
}
