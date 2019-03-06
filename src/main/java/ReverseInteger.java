/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Assume we are dealing with an environment which could only store
 * integers within the 32-bit signed integer range: [−231,  231 − 1].
 * <p>
 * For the purpose of this problem, assume that your function
 * returns 0 when the reversed integer overflows.
 * Created by cuiyunhong on 2018/10/15.
 * @author cuiyunhong.
 */
public class ReverseInteger {
    public int reverse(int x) {
        String target = String.valueOf(x);
        final String reverse;
        if (x < 0) {
            reverse = "-" + reverse(target.substring(1));
        } else {
            reverse = reverse(target);
        }

        Long reversed = Long.parseLong(reverse);
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        return Integer.parseInt(reverse);
    }

    private String reverse(String target) {
        if (target == null) {
            return null;
        }
        char[] before = target.toCharArray();
        char[] after = new char[before.length];
        for (int i = before.length - 1; i >= 0; i--) {
            after[before.length -1 - i] = before[i];
        }
        return new String(after);
    }
}
