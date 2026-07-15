import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner cal = new Scanner(System.in);
        char opr = cal.next().trim().charAt(0);
        int sum=0; 
        if(opr=='+' || opr=='-' || opr=='*' || opr=='/' || opr=='%'){
        int a = cal.nextInt();
        int b=cal.nextInt();
        if(opr=='+')
            sum=a+b;
        if(opr=='-')
            sum=a-b;
        if(opr=='*')
            sum=a*b;
        if(opr=='/')
            sum=a/b;
        else{
            sum=a%b;
        }

        }
     System.out.println(sum);
    }
}
