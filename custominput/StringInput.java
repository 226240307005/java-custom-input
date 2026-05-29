package custominput;

import java.util.Scanner;
public class StringInput{
    public static String input(String str){
       System.out.print(str);
       Scanner obj=new Scanner(System.in);
       String value=obj.nextLine();
       return value;
       
    }
}
