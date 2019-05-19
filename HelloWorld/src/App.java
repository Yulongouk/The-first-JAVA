import java.util.*;
class App{
   public static void main(String[] agr){
      int b;
      Scanner put = new Scanner(System.in);
      int year = put.nextInt();
      int month = put.nextInt();

      if((year%4)==0)
         b = 0;
      else
         b = 1;
      switch (month){
         case 1:
            System.out.println("January has 31 days");
            break;
         case 2 :
            if(b==1)
               System.out.println("February has 28 days");
            else
               System.out.println("February has 29 days");
            break;
         case 3 :
            System.out.println("March has 31 days");
            break;
         case 4 :
            System.out.println("April has 30 days");
            break;
         case 5 :
            System.out.println("May has 31 days");
            break;
         case 6 :
            System.out.println("June has 30 days");
            break;
         case 7 :
            System.out.println("July has 31 days");
            break;
         case 8 :
            System.out.println("August has 31 days");
            break;
         case 9 :
            System.out.println("September has 30 days");
            break;
         case 10 :
            System.out.println("October has 31 days");
            break;
         case 11 :
            System.out.println("November has 30 days");
            break;
         case 12 :
            System.out.println("December has 31 days");
            break;
         default:
            System.out.println("Enter number from 1 to 12");
            break;
      }
   }
}