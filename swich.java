import  java.util.*;
public class swich {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in); 
       System.out.print("enter the number 1 t0 7 ");
       int days =  sc.nextInt(); 

       switch (days) {
           case 1:
               System.out.println("Monday");
               break;
               case 2 :  
               System.out.println("Thuesday");
               break;
               case 3: 
               System.out.println("Wednesday");
               break;
               case 4:
               System.out.println("Thursday");
               break;
               case 5 : 
               System.out.println("Friday");
               break;
               case 6 : 
               System.out.println("Saturday");
               break;
               case 7 : 
               System.out.println("Sunday");
               break;
           default:
             System.out.println("Invaild number ");
            }
    }
}
