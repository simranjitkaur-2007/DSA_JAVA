class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        int sum=0;
        int prev=0;
        Map<Character,Integer> map=Map.of(
            'I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000
        );
        for(int i=n-1;i>=0;i--){
            int curr=map.get(s.charAt(i));
            if(prev>curr)
            sum=sum-curr;
            else{
            sum=sum+curr;
                       }
       prev=curr;
        }
        
        return sum;
    }
}