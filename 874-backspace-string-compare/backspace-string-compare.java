class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        int i=0;
        int j=0;                               
        while(i<s.length()){
            if(s.charAt(i)=='#' && stack1.size()>0)
            stack1.pop();
else if(s.charAt(i)!='#')
            stack1.push(s.charAt(i));
            i++;
        }
          while(j<t.length() ){
            if(t.charAt(j)=='#' && stack2.size()>0)
            stack2.pop();
else if(t.charAt(j)!='#')
            stack2.push(t.charAt(j));
            j++;
        }
        return stack1.equals(stack2);
    }
}