class Solution {
    public boolean isValid(String s) {
//        Stack<Character> stack=new Stack<>();
//        HashMap<Character,Character> map=new HashMap<>();
//        map.put(']','[');
//        map.put(')','(');
//        map.put('}','{');
//        for(char c:s.toCharArray()){
//         if(map.containsValue(c))
//         stack.push(c);
//         else if(map.containsKey(c)){
//             if(stack.isEmpty() || stack.pop()!=map.get(c))
//             return false;
//         }
//        }
// return stack.isEmpty();

       Stack<Character> stack=new Stack<>();
          for(char c:s.toCharArray()){
            if(c=='[' ||c=='(' ||c=='{')
            stack.push(c);
            else{
                if(stack.isEmpty())
                return false;
                char top=stack.pop();
                if((c==')' && top!='(')
                || (c=='}' && top!='{') || (c==']' && top!='['))
                return false;
            }
        }
            return stack.isEmpty();
    }
}
