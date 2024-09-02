package Assignment2;

import java.util.Scanner;

public class PrimeNo1toN {

		public static void main(String[] args)
		{
			Scanner scanner=new Scanner(System.in);
			int i=0;
			int num=0;
			String primeNumbers="";
			System.out.println("Enter the value of N:");
			int N=scanner.nextInt();
			scanner.close();
			
			for(i=1;i<=N;i++)
			{
				int counter=0;
				for(num=i; num>=1; num--)
				{
				if(i%num==0)
				{
					counter = counter+1;
				}
			}
				if(counter==2)
				{
					primeNumbers = primeNumbers + i + " ";
				}
		}
			System.out.println("Prime numbers from 1 to N are:");
			System.out.println(primeNumbers);
	}
	}

