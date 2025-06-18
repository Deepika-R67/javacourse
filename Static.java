import java.util.Scanner;

public class Static {
    static int a;
    static int b;
    int c;

    public static void add() {
        int sum = a + b;
        System.out.println("Addition (a + b): " + sum);
    }

    public static void multiply() {
        int product = a * b;
        System.out.println("Multiplication (a * b): " + product);
    }

    public void divide() {
        int result = a / c;
        System.out.println("Division (a ÷ c): " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        a = sc.nextInt();

        System.out.print("Enter value for b: ");
        b = sc.nextInt();

        System.out.print("Enter value for c: ");
        Static obj = new Static();
        obj.c = sc.nextInt();

        add();
        multiply();
        obj.divide();

        sc.close();
    }
}
