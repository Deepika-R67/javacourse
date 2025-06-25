import java.util.Scanner;

public class ArrayComparison {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
         int[] array1 = new int[size];
        int[] array2 = new int[size];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }
        boolean areEqual = true;
        for (int i = 0; i < size; i++) {
            if (array1[i] != array2[i]) {
                areEqual = false;
                break;
            }
        }
        if (areEqual) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }

        scanner.close();
    }
}

    

