class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String c:operations){
       if(c.equals("D"))
        stack.push(stack.peek()*2);
          else if(c.equals("C"))
        stack.pop();
          else if(c.equals("+")){
            int temp1=stack.pop();
            int temp2=stack.pop();
            int num=temp1+temp2;
            stack.push(temp2);
            stack.push(temp1);
            stack.push(num);
          }
          else
          stack.push(Integer.parseInt(c));
        }
        int sum=0;
        for (int i:stack)
        sum+=i;

return sum;
    }
    }