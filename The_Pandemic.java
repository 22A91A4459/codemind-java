import java.util.Scanner;
public class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        if(n==1)
        {
            System.out.printf("0");
        }
        else if(n==2)
        {
            System.out.printf("1");
        }
        else
        {
            System.out.printf("2");
        }
    }
}