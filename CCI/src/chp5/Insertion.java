package chp5;

public class Insertion {


    static int insert(int n, int m, int i, int j) {
        for (int k = i; k <= j; k++)
            n = Bit.update(n, k, Bit.get(m, k-i));

        return n;
    }

    static int insert1(int n, int m, int i , int j) {

        /* Create a mask to clear bits i through j in n.
        Example: i = 2, j = 4. Result should be 1110 0011.
        For simplicity, we'll use just 8 bits for the example.
         */
        int allOnes = ~0;  // will equal sequence of all 1s

        // 1s before position j, then 0s. left = 1110 0000
        int left = allOnes << (j+1);

        // 1's after position i. right = 0000 0011
        int right = (1<<i) - 1;

        // All 1s, except for 0s between i and j. mask = 1110 0011
        int mask = left | right;

        // clear bits j through i then put m in there
        int n_cleared = n & mask; // clear bits j through i.
        int m_shifted = m << i; // Move m into correct position.
        return n_cleared | m_shifted; // OR them, and we're done.
    }
}
