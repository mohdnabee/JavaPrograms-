import java.util.*;
public class eligibility {
    
    public static void main(String[] args) {
       // 13.	Check eligibility to voteint age = 20; if (age >= 18)     
       //System.out.println("Eligible to vote"); else     System.out.println("Not eligible");

       Scanner vote = new Scanner(System.in); 
       System.out.println("Enter Your Age");
       int age = vote.nextInt(); 

       if (age >= 18){
        System.out.println("Eligible For Vote");
       }else {
        System.out.println("Not Eligible For Vote");
       }


    }
}
