import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        // Input 10 elements
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // Print using for loop
        System.out.println("\nPrinting using for loop:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Print using do-while loop
        System.out.println("\n\nPrinting using do-while loop:");
        int j = 0;
        do {
            System.out.print(numbers[j] + " ");
            j++;
        } while (j < 10);

        // Print using while loop (reducing index)
        System.out.println("\n\nPrinting using while loop (reducing):");
        int k = 9;
        while (k >= 0) {
            System.out.print(numbers[k] + " ");
            k--;
        }

        sc.close();
    }
}
