import java.util.Scanner;
public class multipication{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        float num1,num2,num3;
        num1=sc.nextFloat();
        num2=sc.nextFloat();
        num3=num1*num2;
        System.out.printf("%.2f",num3);
        
    }
}