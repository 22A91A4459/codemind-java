import java.util.Scanner;
public class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        int count2=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch <= 'z' && ch >= 'a' || ch >= 'A' && ch <= 'Z' || ch == ' '){
                count2++;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}