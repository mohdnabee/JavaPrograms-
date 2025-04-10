import java.util.*;

public class operators {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); 
        System.out.println("Enter the 1st numbers: ");
        int a = in.nextInt();
        System.out.println("Enter the 2nd numbers: ");
        int b = in.nextInt();

        System.out.println("Enter the opertaion +, -, *, /,% ");
        char operator =  in.next().charAt(0);
        switch (operator) {
       case '+':
       System.out.println("Addition : "+(a+b) );
       break;
       case '-':
       System.out.println("Subtraction : " + (a-b));
           break;
           case '*':
      System.out.println("Multiplication : " +(a*b));
               break;
               case '/' :
               if(b == 0) {
                System.out.println("Invalid Division");
            } else {
                System.out.println("divison : "+(a/b));
            }
            break;
               case '%':if(b == 0) {
                System.out.println("Invalid Division");
            } else {
                System.out.println("Modulus : "+ (a % b));
            }    
               break;
       default:
         System.out.println("inavild operator");
   }
        
    }

}
