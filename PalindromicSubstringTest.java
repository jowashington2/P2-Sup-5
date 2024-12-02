import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromicSubstringTest {

    @Test
    void testLongestPalindrome() {
        assertEquals("aba", PalindromicSubstring.longestPalindrome("babad"));
        assertEquals("bb", PalindromicSubstring.longestPalindrome("cbbd"));
        assertEquals("a", PalindromicSubstring.longestPalindrome("a"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", PalindromicSubstring.longestPalindrome(""));
    }
}
