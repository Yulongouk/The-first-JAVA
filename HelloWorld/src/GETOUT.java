public class GETOUT {
    public static void main(String[] agr){
        int a=4,b=10;
        System.out.println("Before swapping"+a+" "+b);
        swap(a, b);
       // System.out.println("After swapping"+a+" "+b);
    }
    static void swap(int a, int b){
        int c = a;
              a = b;
              b = c;
        System.out.println("After swapping"+a+" "+b);
    }

}