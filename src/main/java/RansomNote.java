import java.util.HashMap;
import java.util.Map;

/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 * <p>
 * Each letter in the magazine string can only be used once in your ransom note.
 * <p>
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * <p>
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
 * 如果可以构成，返回 true ；否则返回 false。
 * <p>
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 * <p>
 * 注意：
 * <p>
 * 你可以假设两个字符串均只含有小写字母。
 *
 * @author tsuixh
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> repository = new HashMap<>(16);
        for (Character character : magazine.toCharArray()) {
            if (repository.containsKey(character)) {
                Integer orign = repository.get(character);
                repository.put(character, orign + 1);
                continue;
            }
            repository.put(character, 1);
        }

        for (Character character : ransomNote.toCharArray()) {
            if (repository.get(character) == null) {
                return false;
            }
            Integer remain = repository.get(character) - 1;
            if (remain < 0) {
                return false;
            }
            repository.put(character, remain);
        }
        return true;
    }
}
