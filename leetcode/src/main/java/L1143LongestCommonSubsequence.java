public class L1143LongestCommonSubsequence {


    public static int longestCommonSubsequence(String str1, String str2) {

        // lcs[i][i] 代表str1[0...i], str2[0...j]子串的lcs
        int[][] lcs = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 1; i <= str1.length(); i++)
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }

        return lcs[str1.length()][str2.length()];
    }
}
