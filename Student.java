import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Student{
    public static void main(String []args){
    String name;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the student name:");
    name = sc.nextLine();

    LocalDate dateOfBirth = LocalDate.of(2004, 7, 24);

    // Get the current date
    LocalDate currentDate = LocalDate.now();

    // Calculate the age of the student
    Period age = Period.between(dateOfBirth, currentDate);

    System.out.println("Age: " + age.getYears() + " years"); 
}
}
