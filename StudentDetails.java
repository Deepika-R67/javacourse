import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.next();

        System.out.print("Enter roll number: ");
        String roll = sc.next();

        System.out.println("Enter marks for 5 subjects:");
        double tamil = sc.nextDouble();
        double english = sc.nextDouble();
        double maths = sc.nextDouble();
        double science = sc.nextDouble();
        double social = sc.nextDouble();

        double total = tamil + english + maths + science + social;
        double average = total / 5;

        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
    }
}