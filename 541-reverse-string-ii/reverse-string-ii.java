class Solution {
    public String reverseStr(String s, int k) {
        int n=s.length();
        int step=k*2;
        char[] arr=s.toCharArray();
        for(int i=0;i<n;i+=step){
            int left=i;
            int end=Math.min(i+k-1,n-1);
        while(left<end){
            char temp=arr[left];
           arr[left]=arr[end];
            arr[end]=temp;  
            left++;
            end--;  
       }
        }
     return new String(arr);
    }
    }