import java.util.System;
public class week{
  public static void main(String[] args){
    Scanner in=new Scanner;
    int day = in.nextInt();
    switch(day){
      case 1,2,3,4,5 -> System.out.println("week day");
      case 6,7 -> System.out.println("weekend");
    }
  }
}
