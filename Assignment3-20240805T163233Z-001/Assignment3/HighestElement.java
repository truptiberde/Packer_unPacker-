package Assignment3;

import java.util.Scanner;

public class HighestElement {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] arr = new int[5];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < 5; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        int highest = findHighest(arr);
	        System.out.println("The highest element in the array is: " + highest);
	    }

	    public static int findHighest(int[] arr) {
	        int highest = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > highest) {
	                highest = arr[i];
	            }
	        }
	        return highest;
	    }
	}

