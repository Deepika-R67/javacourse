import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double area = 3.14 * r * r;
        double perimeter = 2 * 3.14 * r;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}