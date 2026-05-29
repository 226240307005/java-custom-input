package custominput;

import java.util.Scanner;
public class FloatInput{
    public static float input(String str){
       System.out.print(str);
       Scanner obj=new Scanner(System.in);
       float value=obj.nextFloat();
       return value;
       
    }
}
