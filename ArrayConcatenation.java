public class ArrayConcatenation {

    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] result = new int[length1 + length2];

        for (int i = 0; i < length1; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < length2; i++) {
            result[length1 + i] = arr2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] target = concatenateArrays(arr1, arr2);

        System.out.print("Concatenated Array: ");
        for (int num : target) {
            System.out.print(num + " ");
        }
    }
}
