package Assignment3;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] numbers= {3, 33, 7, 77, 27, 18};
		Arrays.sort(numbers);
		System.out.println("Sorted Numbers:");
		for(int number:numbers) {
			System.out.println(number);
		}
	}
}
