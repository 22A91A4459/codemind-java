import java.util.Scanner;
public class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if((x>0 || y%2==0) && x%2==0)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");
        }
    }
}