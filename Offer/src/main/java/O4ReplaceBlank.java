public class O4ReplaceBlank {

    public static String replaceBlank(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                result.append("%20");
            else
                result.append(str.charAt(i));
        }
        return result.toString();
    }
}
