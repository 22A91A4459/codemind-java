import java.util.Scanner;
public class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        if(s == 'A' || s == 'a' || s == 'E' || s == 'e' || s == 'I' || s == 'i' || s == 'o' || s == 'O' || s == 'u' || s == 'U')
        {
            System.out.printf("Vowel");
        }
        else
        {
            System.out.printf("Consonant");
        }
    }
}