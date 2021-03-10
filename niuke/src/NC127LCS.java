
public class NC127LCS {


    public static String LCS(String str1, String str2) {

        // Invariant
        // lcs[i][j] 代表以str1[i]，str2[j]结尾的最长公共子串
        // i，j 从1开始
        int[][] lcs = new int[str1.length() + 1][str2.length() + 1];

        int max = 0;
        // str1的下标
        int index = 0;
        for (int i = 1; i <= str1.length(); i++)
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                    if (lcs[i][j] > max) {
                        max = lcs[i][j];
                        index = i;
                    }
                }
            }

        return str1.substring(index - max, index);
    }
}
