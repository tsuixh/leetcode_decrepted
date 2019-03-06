/**
 * 判断一个数是否为奇数，是则返回true，否则返回false
 *
 * @author smartcyh@hotmail.com
 */
public class IsOddNumber {
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
