import java.util.Scanner;
public class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        double u,c,b,su,total;
        String name,id;
        name=sc.nextLine();
        id=sc.nextLine();
        u=sc.nextDouble();
        if(u<=199)
        {
            c=1.20;
        }
        else if(u>=200 && u<=400)
        {
            c=1.50;
        }
        else if(u>=400 && u<600)
        {
            c=1.80;
        }
        else
        {
            c=2.00;
        }
        b=c*u;
        if(b>400)
        {
            su=0.15*b;
        }
        else
        {
            su=100;
        }
        total=b+su;
        System.out.printf("%.2f",total);
    }
}