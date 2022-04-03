package chp1;

public class URLify {
    public static String urlify(char[] url, int length) {
        for (int i = length-1, j = url.length-1; i >= 0; i--){
            if (url[i] == ' ') {
                url[j--] = '0';
                url[j--] = '2';
                url[j--] = '%';
            } else {
                url[j--] = url[i];
            }
        }

        return new String(url);
    }
}
