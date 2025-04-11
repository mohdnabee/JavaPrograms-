import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        int marks = scanner.nextInt();

        if (marks >= 0 && marks <= 100) {
            if (marks >= 90) {
                System.out.println("Grade A");
            } else if (marks >= 75) {
                System.out.println("Grade B");
            } else if (marks >= 60) {
                System.out.println("Grade C");
            } else if (marks >= 33){
                System.out.println("Grade D");
            }else{
                System.out.println("Fail");
            }
        } else {
            System.out.println("Invalid marks. Please enter marks between 0 and 100.");
        }
    }
    
}


