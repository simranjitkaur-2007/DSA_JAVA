class Solution {
    public String makeGood(String s) {
        StringBuilder ans=new StringBuilder();
        Stack<Character> stack=new Stack();
        for (int i = 0; i < s.length(); i++)
        {
            if (!stack.isEmpty() && Math.abs(stack.peek()-s.charAt(i))==32)
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        for (char c:stack)
            ans.append(c);
        return ans.toString();
    }
}