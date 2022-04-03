import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class L151ReverseWordsInAString {

    public static String reverseWords(String s) {

        String[] split = s.split("\\s");

        List<String> collect = Arrays.stream(split)
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());
        Collections.reverse(collect);

        return String.join(" ", collect);
    }

}
