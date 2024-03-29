import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. 
 * Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 * Roman numerals are usually written largest to smallest from left to right. 
 * However, the numeral for four is not IIII. Instead, the number four is written as IV. 
 * Because the one is before the five we subtract it making four. 
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 *
 * @author tsuixh
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        final char[] romans = s.toCharArray();
        final Map<Character, Integer> reference= getReference();
        int intValue = 0;
        for (int i = 0; i < romans.length; i++) {
            if (i != romans.length - 1) {
                int current = reference.get(romans[i]);
                int next = reference.get(romans[i + 1]);
                if (next > current) {
                    intValue += (next - current);
                    i++;
                } else {
                    intValue += current;
                }
            } else {
                intValue += reference.get(romans[i]);
            }
        }
        return intValue;
    }

    private Map<Character,Integer> getReference() {
        Map<Character, Integer> reference = new HashMap<>();
        reference.put('I', 1);
        reference.put('V', 5);
        reference.put('X', 10);
        reference.put('L', 50);
        reference.put('C', 100);
        reference.put('D', 500);
        reference.put('M', 1000);
        return reference;
    }
}
