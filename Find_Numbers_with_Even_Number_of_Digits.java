import java.util.*;
public class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] arr=new String[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
           int len=arr[i].length();
           if(len%2==0){
               count++;
           }
        }
        System.out.println(count);
    }
}