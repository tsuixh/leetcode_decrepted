/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Created by cuiyunhong on 2018/10/16.
 *
 * @author cuiyunhong.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int idx = 0;
        String ss = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < ss.length()) {
                idx = i;
                ss = strs[i];
            }
        }
        String lcp = ss;
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            if (str.equals(ss) && idx == i) {
                continue;
            }
            String commonPrefix = getLongestCommonPrefixOfTwo(ss, str);
            if ("".equals(commonPrefix)) {
                return "";
            }
            if (commonPrefix.length() < ss.length()) {
                lcp = commonPrefix;
            }
        }
        return lcp;
    }

    private String getLongestCommonPrefixOfTwo(String a, String b) {
        if (a == null || b == null) {
            return "";
        }
        int length = a.length() > b.length() ? b.length() : a.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                break;
            }
            sb.append(a.charAt(i));
        }
        return sb.toString();
    }
}
