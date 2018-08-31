import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest extends Palindrome {

    @org.junit.jupiter.api.Test
    void isPalindrome() {
        assertTrue(isPalindrome(999));
        assertFalse(isPalindrome(9939));
        assertTrue(isPalindrome(9939));
    }

    @org.junit.jupiter.api.Test
    void lpTest() {
        assertFalse(lp() == 33);
//        assertTrue(lp() == 33);
    }
}