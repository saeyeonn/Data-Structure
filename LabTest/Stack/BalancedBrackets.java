package Stack;

import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else if (c == ')') {
                    if ('(' != stack.pop()) {
                        return "NO";
                    }
                } else if (c == '}') {
                    if ('{' != stack.pop()) {
                        return "NO";
                    }
                } else if (c == ']') {
                    if ('[' != stack.pop()) {
                        return "NO";
                    }
                }
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
