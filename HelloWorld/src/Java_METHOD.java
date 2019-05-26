import java.util.Scanner;
public class Java_METHOD {
    public static void main(String[] agr){
        mythod("Yulong");
        System.out.println(trolop(9));
    }
     static void mythod(String f){
      System.out.println("My name is "+ f);
    }
    //It belows is the return value when the function is  called;
    static int trolop(int x){
        return x+x;  //The result is 18;
    }
}