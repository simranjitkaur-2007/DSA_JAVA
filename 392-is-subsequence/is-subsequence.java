class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=t.length();
        int m=s.length();
        int i=0;
        
        if (s.length() == 0) {
    return true;
}
        for(int j=i;j<n;j++){
            if (i<m && s.charAt(i) == t.charAt(j) ){
            i++;
            }
            if(i==m)
            return true;
        }
        return false;
    }
}