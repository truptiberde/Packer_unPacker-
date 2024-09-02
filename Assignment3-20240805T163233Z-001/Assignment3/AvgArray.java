package Assignment3;

import java.util.Scanner;

public class AvgArray {


	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the size of the array: ");
	    int size = scanner.nextInt();

	    int[] array = new int[size];

	    System.out.println("Enter the elements of the array:");
	    for (int i = 0; i < size; i++) {
	      array[i] = scanner.nextInt();
	    }

	    int sum = 0;
	    for (int element : array) {
	      sum += element;
	    }

	    float average = (float) sum / size;

	    System.out.println("The average of the elements in the array is: " + average);
	  }
	}

