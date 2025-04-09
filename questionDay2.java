import  java.util.*;
public class questionDay2 {
    public static void main(String[] args) {
        // addtion , subtarction ,multiplication , division of two numbers 

        int a =  10 ; 
        int b = 5 ; 

        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the opertaion +, -, *, /,% ");
        char operator =  sc.next().charAt(0);

        if (operator == '+'){
            System.out.println("Addition : "+(a+b) );
        }else if (operator == '-'){
            System.out.println("Subtraction : " + (a-b));
        }else if (operator == '*'){
            System.out.println("Multiplication : " +(a*b));
        }else if (operator == '/'){
            System.out.println("divison : "+(a/b));
        }else if(operator == '%'){
            System.out.println("Modulus : "+ (a%b));
        }
        else {
            System.out.println("invaild operator" );
        }
    }
    
}
