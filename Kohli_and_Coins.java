import java.util.Scanner;
public class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%10==0)
        {
            System.out.println(n/10);
        }
        else if(n%10==5)
        {
            int a=(n/10)+1;
            System.out.println(a);
        }
        else
        {
            System.out.printf("-1");
        }
    }
}