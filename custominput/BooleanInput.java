package custominput;

import java.util.Scanner;
public class BooleanInput{
    public static boolean input(String str){
       System.out.print(str);
       Scanner obj=new Scanner(System.in);
       boolean value=obj.nextBoolean();
       return value;
       
    }
}
