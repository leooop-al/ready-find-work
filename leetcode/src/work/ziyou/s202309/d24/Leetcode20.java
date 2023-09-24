package work.ziyou.s202309.d24;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 */
public class Leetcode20 {

    public static void main(String[] args) {
        Leetcode20 leetcode20 = new Leetcode20();
        System.out.println(leetcode20.isValid("(())"));
    }

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> characterStack = new Stack<>();
        for (char a : s.toCharArray()) {
            if (characterStack.empty()) {
                if (a == ')' || a == ']' || a == '}') {
                    return false;
                }
                characterStack.push(a);
            } else {
                Character b = characterStack.peek();
                if ((b == '(' && a == ')')
                        || (b == '[' && a == ']')
                        || (b == '{' && a == '}')) {
                    characterStack.pop();
                } else {
                    characterStack.push(a);
                }
            }
        }
        return characterStack.empty();
    }
}
