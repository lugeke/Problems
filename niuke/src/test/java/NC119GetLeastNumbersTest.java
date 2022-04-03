import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class NC119GetLeastNumbersTest {

    @Test
    public void getLeastNumbers_Solution() {

        List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());

        for (int i = 0; i < 100; i++) {
            Collections.shuffle(list);
//            System.out.println(list);
            int[] ints = list.stream().mapToInt(j -> j).toArray();

            ArrayList<Integer> least = NC119GetLeastNumbers.GetLeastNumbers_Solution(ints, 4);
            assertEquals(Arrays.asList(1,2,3,4), least);
        }

//        [],0
        assertEquals(Collections.emptyList(), NC119GetLeastNumbers.GetLeastNumbers_Solution(new int[0], 0));
    }

}