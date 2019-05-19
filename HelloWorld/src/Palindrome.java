import java.util.Scanner;
public class Palindrome {
    public static void main(String[] agr){
        int b=0;
        System.out.println("Enter the number");
        Scanner value= new Scanner(System.in);
        int a = value.nextInt();
        int c=a;
        while(c!=0){
            b*=10;
            b=b+c%10;
            c/=10;
        }
        if(b==a)
            System.out.println("It is the palindrome number");
        else
            System.out.println("It isn't the palindrome number");

    }
}
