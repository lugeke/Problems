import java.math.BigInteger;

public class L165CompareVersionNumbers {

    public static int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int min = Math.min(v1.length, v2.length);
        for (int i = 0; i < min; i++) {
            int x = Integer.valueOf(v1[i]);
            int y = Integer.valueOf(v2[i]);

            if (x != y) return x < y ? -1 : 1;
        }

        String[] v3 = v1.length > v2.length ? v1 : v2;
        for (int i = min; i < v3.length; i++) {
            if (Integer.valueOf(v3[i]) != 0) {
                if (v3 == v1) return 1;
                else return -1;
            }
        }
        return 0;
    }


}
