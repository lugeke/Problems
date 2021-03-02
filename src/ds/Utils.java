package ds;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import java.util.stream.Stream;

public class Utils {

    private Utils() {}

    public static <T> Map<T, Long> frequencyMap(Stream<T> elements) {
        return elements.collect(
                groupingBy(
                        Function.identity(),
                        HashMap::new, // can be skipped
                        counting()
                )
        );
    }
}
