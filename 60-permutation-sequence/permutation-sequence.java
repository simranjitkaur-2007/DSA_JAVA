class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb=new StringBuilder();
        for (int o=1;o<=n;o++) {
            sb.append(o);
        }
        for (int count=1;count<k;count++) {
            permutation(sb);
        }
        return sb.toString();
    }
    private void permutation(StringBuilder sb) {
        int n=sb.length();
        int i=n-2;
        while (i>=0 && sb.charAt(i)>=sb.charAt(i+1)) {
            i--;
        }
        if (i>=0){
            int j=n-1;
            while(sb.charAt(j)<=sb.charAt(i)) {
                j--;
            }
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
        }
        reverse(sb,i+1,n-1);
    }
    private void reverse(StringBuilder sb, int left, int right) {
        while(left<right){
            char temp=sb.charAt(left);
            sb.setCharAt(left,sb.charAt(right));
            sb.setCharAt(right,temp);
            left++;
            right--;
        }
    }
}