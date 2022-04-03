import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class NC119GetLeastNumbers {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>(k);
        if (k > input.length || k == 0) return list;

        PriorityQueue<Integer> pq = new PriorityQueue<>(k, Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            pq.add(input[i]);
            list.add(0);
        }

        for (int i = k; i < input.length; i++) {
            if (input[i] > pq.peek()) continue;
            pq.poll();
            pq.add(input[i]);
        }

        for (int i = 0; i < k; i++) {
            list.set(k-1-i, pq.poll());
        }

        return list;
    }
}
