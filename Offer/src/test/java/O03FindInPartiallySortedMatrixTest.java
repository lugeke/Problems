import org.junit.Test;

import static org.junit.Assert.*;

public class O03FindInPartiallySortedMatrixTest {

    @Test
    public void find() {
        int[][] matrix = new int[][] {
                {1,2,8,9},
                {2,4,8,12},
                {4,7,10,13},
                {6,8,11,15}
        };

        assertTrue(O3FindInPartiallySortedMatrix.find(matrix,7));
        assertTrue(O3FindInPartiallySortedMatrix.find(matrix,1));
        assertTrue(O3FindInPartiallySortedMatrix.find(matrix,9));
        assertTrue(O3FindInPartiallySortedMatrix.find(matrix,6));
        assertTrue(O3FindInPartiallySortedMatrix.find(matrix,15));

        assertFalse(O3FindInPartiallySortedMatrix.find(matrix,0));
        assertFalse(O3FindInPartiallySortedMatrix.find(matrix,3));
        assertFalse(O3FindInPartiallySortedMatrix.find(matrix,5));
        assertFalse(O3FindInPartiallySortedMatrix.find(matrix,14));
        assertFalse(O3FindInPartiallySortedMatrix.find(matrix,16));

        assertFalse(O3FindInPartiallySortedMatrix.find(null,16));
        assertFalse(O3FindInPartiallySortedMatrix.find(new int[0][0],16));
    }
}