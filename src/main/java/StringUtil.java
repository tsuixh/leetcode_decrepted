/**
 * 字符类型的工具类
 *
 * @author tsuixh
 */
public class StringUtil {

    /**
     * 逆转字符
     * @param target    目标字符传
     * @return    逆序后的字符串
     */
    public String reverse(String target) {
        char[] targetChars = target.toCharArray();
        char[] resultChars = new char[targetChars.length];
        for (int i = targetChars.length - 1; i >= 0; i--) {
            resultChars[targetChars.length - 1 - i] = targetChars[i];
        }
        return new String(resultChars);
    }
}
