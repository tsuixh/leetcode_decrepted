/**
 * Determine whether an integer is a palindrome. 
 * An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * @author tsuixh
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 5 == 0 && x != 0)) {
            return false;
        }

        String s = String.valueOf(x);
        return s.equals(reverse(s));
    }

    private String reverse(String target) {
        char[] targetChars = target.toCharArray();
        char[] resultChars = new char[targetChars.length];
        for (int i = targetChars.length - 1; i >= 0; i--) {
            resultChars[targetChars.length - 1 - i] = targetChars[i];
        }
        return new String(resultChars);
    }
}
