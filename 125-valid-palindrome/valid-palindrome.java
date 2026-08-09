       public class Solution{	
	public static boolean isPalindrome(String s){
        int n=s.length();
        StringBuilder rev= new StringBuilder(n);
        for(int i=0;i<n;i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
               char c=Character.toLowerCase(s.charAt(i));
               rev.append(c);
             }
        }
         String original = rev.toString();
        String reversed = rev.reverse().toString();

        if(original.equals(reversed))
        return true;
     else
        return false;
        }
       }