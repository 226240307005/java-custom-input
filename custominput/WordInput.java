package custominput;

import java.util.Scanner;
public class WordInput{
    public static String input(String str){
       System.out.print(str);
       Scanner obj=new Scanner(System.in);
       String value=obj.next();
       return value;
       
    }
}
