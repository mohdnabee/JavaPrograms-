public class Questions {
    public static void main(String[] args) {
        	//Predict the output:  int x = 5; double y = 10; System.out.println(x + y);
            int x = 5 ; 
            double y =10 ; 
            System.out.println(x+y);
            System.out.println();

            System.out.println("Swap two numbers using a temporary variable");
            System.out.println();

            int num1 = 5;
            int num2 = 10;
    
            System.out.println("Before swapping:");
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
            // Swap numbers using temporary variable
            int temp = num1;
            num1 = num2;
            num2 = temp;
            System.out.println("After swapping:");
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
        
    }
    
}
	