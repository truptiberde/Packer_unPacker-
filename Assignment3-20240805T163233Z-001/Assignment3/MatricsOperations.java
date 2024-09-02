package Assignment3;

import java.util.Scanner;

public class MatricsOperations {
	

		public static void main(String[] args) {
			

	int arr1[][]= new int[3][3];
	int arr2[][]= new int[3][3];
	int arr3[][]= new int[3][3];
	int arr4[][]= new int[3][3];
	float arr5[][]= new float[3][3];
	int r,c;

	Scanner sc=new Scanner(System.in);

	 

	System.out.println("Enter Array1 Elelments:");

	for(r=0; r<3; r++)
	{
		for(c=0; c<3; c++)
		{
			arr1[r][c]=sc.nextInt();
		}
	}

	for(r=0; r<3; r++)
	{
		for(c=0; c<3; c++)
		{
			System.out.print(" "+arr1[r][c]);
		}
		System.out.print("\n");

		}



	System.out.println("Enter Array2 Elelments:");

	for(r=0; r<3; r++)
	{
		for(c=0; c<3; c++)
		{
			arr2[r][c]=sc.nextInt();
		}
	}

	for(r=0; r<3; r++)
	{
		for(c=0; c<3; c++)
		{
			System.out.print(" "+arr2[r][c]);
		}
		System.out.print("\n");

		}

	// Addition

	System.out.println("Addition of two array's:");

	for(r=0; r<3; r++)
	{
		for(c=0; c<3; c++)
		{
			arr3[r][c]=arr1[r][c] + arr2[r][c] ;
		}
	}

	for(r=0; r<3; r++)
	{
		for(c=0; c<3; c++)
		{
			System.out.print(" "+arr3[r][c]);
		}
		System.out.print("\n");

		}

	// Subtraction

	System.out.println("subtraction of two array's:");

	for(r=0; r<3; r++)
	{
		for(c=0; c<3; c++)
		{
			arr4[r][c]=arr1[r][c] - arr2[r][c] ;
		}
	}

	for(r=0; r<3; r++)
	{
		for(c=0; c<3; c++)
		{
			System.out.print(" "+arr4[r][c]);
		}
		System.out.print("\n");

		}

	// Division 

	System.out.println("Division of two array's:");

	for(r=0; r<3; r++)
	{
		for(c=0; c<3; c++)
		{
			arr5[r][c]=arr1[r][c] / arr2[r][c] ;
		}
	}

	for(r=0; r<3; r++)
	{
		for(c=0; c<3; c++)
		{
			System.out.print(" "+arr5[r][c]);
		}
		System.out.print("\n");

		}


	}
	}



