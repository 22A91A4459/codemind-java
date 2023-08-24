import java.util.Scanner;
public class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int count=0;
            for(int j=a;j<=b;j++)
            {
                if(j%10==2)
                {
                    count++;
                }
                else if(j%10==3)
                {
                    count++;
                }
                else if(j%10==9)
                {
                    count++;
                }
               
                
            }
            System.out.println(count);
        }
        
        
    }
}