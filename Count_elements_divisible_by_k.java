import java.util.Scanner;
public class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=0;
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int arr []=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%k==0){
                c++;
            }
        }
        System.out.println(c);
    }
}