/**
 * @link https://leetcode-cn.com/problems/reverse-words-in-a-string/
 */
public class ReverseWordsOfSentence {
    public String reverseWords(String s)
    {
        s = s.trim();
        String[] words = s.split(" +");
        reverse(words);
        return String.join(" ", words);
    }

    private void reverse(String[] words)
    {
        int halfPoint = words.length / 2;
        int len = words.length;
        String temp;
        for (int i = 0; i < halfPoint; i++)
        {
            temp = words[i];
            words[i] = words[len - 1 - i];
            words[len - 1 - i] = temp;
        }
    }
}
