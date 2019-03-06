/**
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * For the purpose of this problem, we will return 0 when needle is an empty string.
 *
 * @author smartcyh@hotmail.com
 */
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (null == needle || "".equals(needle)) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if ((haystack.length() - i) < needle.length()) {
                    return -1;
                }
                if (needle.equals(haystack.substring(i, i + needle.length()))) {
                    return i;
                }
            }
        }
        return -1;
    }
}
