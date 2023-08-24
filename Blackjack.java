import java.util.Scanner;
public class sample{
    public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int a,b;
          a=sc.nextInt();
          b=sc.nextInt();
          int c=21-(a+b);
          if(a+b+c==21 && c>=1 && c<=10)
          {
              System.out.println(c);
          }
          else
          {
              System.out.printf("-1");
          }
          
          
    }
}