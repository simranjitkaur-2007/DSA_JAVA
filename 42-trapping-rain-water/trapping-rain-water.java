class Solution {
    public int trap(int[] height) {
        int leftMax=0;
        int rightMax=0;
        int n=height.length;
        int start=0;
        int end=n-1;
        int area=0;
        while(start<end){
            leftMax=Math.max(height[start],leftMax);
            rightMax=Math.max(height[end],rightMax);
            if(leftMax<rightMax){
            area+=leftMax-height[start];
            start++;
            }
            else{
            area+=rightMax-height[end];
            end--;
            }
        }
        return area;
    }
}