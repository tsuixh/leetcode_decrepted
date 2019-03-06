import java.util.Stack;

public class BraceMatch {
    public boolean isValid(String s) {
        Stack<Character> braces = new Stack<>();
        char[] chars = s.toCharArray();
        for (char brace : chars) {
            if (braces.isEmpty()) {
                braces.push(brace);
                continue;
            }
            if (brace == ')' && '(' == braces.peek()) {
                braces.pop();
                continue;
            }
            if (brace == ']' && '[' == braces.peek()) {
                braces.pop();
                continue;
            }
            if (brace == '}' && '{' == braces.peek()) {
                braces.pop();
                continue;
            }
            braces.push(brace);
        }
        return braces.isEmpty();
    }
}
