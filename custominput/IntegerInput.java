package custominput;
import java.util.Scanner;
public class IntegerInput{
    public static int input(String str){
       System.out.print(str);
       Scanner obj=new Scanner(System.in);
       int value=obj.nextInt();
       return value;
       
    }
}
