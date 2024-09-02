package assignment1;

import java.io.*;

public class Swapwithoutthirdvalue {

	public static void main(String[] args)
	{
		int a=7;
		int b=3;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping:"+"a="+a+",b="+b);
	}
}
