package ValidParenthesesPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{(})";
        System.out.println(isValid(s));
    }

    private static Map<Character, Character> characterMap;
    static {
        characterMap = new HashMap<>();
        characterMap.put(']', '[');
        characterMap.put('}', '{');
        characterMap.put(')', '(');
    }
    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ']' || c == '}' || c == ')') {
                if (characterStack.empty() || characterStack.pop() != characterMap.get(c)) {
                    return false;
                }
            } else {
                characterStack.push(c);
            }
        }
        if (characterStack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
