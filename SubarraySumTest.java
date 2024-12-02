import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SubarraySumTest {

    @Test
    void testUniqueSubarrays() {
        int[] input = {1, 2, 3};
        assertEquals(2, SubarraySum.countSubarrays(input, 3));

        int[] input2 = {1, 1, 1};
        assertEquals(3, SubarraySum.countSubarrays(input2, 2));

        int[] input3 = {10, 2, -2, -20, 10};
        assertEquals(1, SubarraySum.countSubarrays(input3, -10));
    }

    @Test
    void testEmptyArray() {
        int[] empty = {};
        assertEquals(0, SubarraySum.countSubarrays(empty, 5));
    }
}
