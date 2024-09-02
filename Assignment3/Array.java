package Assignment3;
import java.util.InputMismatchException;
import java.util.Scanner;

class ArrayOperations {
    int[] array;

    ArrayOperations(int size) {
        array = new int[size];
    }

    void initializeArray(Scanner scanner) {
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            while (true) {
                try {
                    array[i] = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid integer:");
                    scanner.next(); // clear the invalid input
                }
            }
        }
    }

    void checkEvenOdd() {
        int sumOfOdd = 0;
        for (int element : array) {
            if (element % 2 != 0) {
                sumOfOdd += element;
            }
        }
        System.out.println("Sum of odd numbers: " + sumOfOdd);
    }
}

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = -1;
        while (size <= 0) {
            System.out.print("Enter the size of the array (positive integer): ");
            try {
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("The size must be a positive integer. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // clear the invalid input
            }
        }

        ArrayOperations arrayOperations = new ArrayOperations(size);
        arrayOperations.initializeArray(scanner);
        arrayOperations.checkEvenOdd();

        scanner.close();
    }
}