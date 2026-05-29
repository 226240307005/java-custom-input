package custominput;

import java.util.Scanner;
public class CharInput{
    public static char input(String str){
       System.out.print(str);
       Scanner obj=new Scanner(System.in);
       char value=obj.next().charAt(0);
       return value;
       
    }
}
