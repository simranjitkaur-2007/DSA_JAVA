class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int i=0;
        while(i<tokens.length){    
        if(tokens[i].equals("+")){
        int temp1=stack.pop();
        int temp2=stack.pop();
        int result=(temp1+temp2);
        stack.push(result);
        }
       else if(tokens[i].equals("-")){
        int temp2=stack.pop();
        int temp1=stack.pop();
       int result=(temp1-temp2);
        stack.push(result);
       }
        else if(tokens[i].equals("/")){
        int temp2=stack.pop();
        int temp1=stack.pop();
        int result=(temp1/temp2);
        stack.push(result);
        }
        else if(tokens[i].equals("*")){
        int temp2=stack.pop();
        int temp1=stack.pop();
       int result=(temp1*temp2);
        stack.push(result);
        }
        else { 
            stack.push(Integer.parseInt(tokens[i]));
        }
       
        i++;
    }
    int sb=stack.pop();
        return sb;
        }
    }