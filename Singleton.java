import java.util.Scanner;

public class Singleton {

    private static Singleton instance;
    String name;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Singleton obj = Singleton.getInstance();

        System.out.print("Enter your name: ");
        obj.name = sc.nextLine();

        obj.printName();

        sc.close();
    }
}
