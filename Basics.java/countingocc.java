import java.util.Scanner;
public class countingocc {
    public static void main(String[] args){
        Scanner ele=new Scanner(System.in);
        int arr[]={1,2,3,4,3,5,6};
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i] == ele.nextInt()){
                c++;
            }
        }
        System.out.println(c);
    }
}
