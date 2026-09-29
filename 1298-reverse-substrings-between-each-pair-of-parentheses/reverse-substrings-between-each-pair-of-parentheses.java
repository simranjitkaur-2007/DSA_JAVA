import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(current);
                current = new StringBuilder();
            } else if (c == ')') {
                current.reverse();
                StringBuilder parent = stack.pop();
                parent.append(current);
                current = parent;
            } else {
                current.append(c);
            }
        }
        
        return current.toString();
    }
}