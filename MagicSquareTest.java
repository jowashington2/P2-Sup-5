import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MagicSquareTest {

    @Test
    void testMagicSquare() {
        int[][] magicSquare = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };
        assertTrue(MagicSquare.isMagicSquare(magicSquare));

        int[][] nonMagicSquare = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 3}
        };
        assertFalse(MagicSquare.isMagicSquare(nonMagicSquare));
    }

    @Test
    void testEmptyMatrix() {
        int[][] empty = {};
        assertFalse(MagicSquare.isMagicSquare(empty));
    }
}
