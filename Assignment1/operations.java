package assignment1;

public class operations {
	public void calcSum()
	{
		int a=7, b=3;
		int s=a+b;
		System.out.println("Sum is:"+s);
	}
	public void calcSub()
	{
		int a=7, b=3;
		int s=a-b;
		System.out.println("Sub is:"+s);
	}
	public void calcMul()
	{
		int a=7, b=3;
		int m=a*b;
		System.out.println("Mul is:"+m);
	}
	public void calcDiv()
	{
		int a=10, b=5;
		int d=a/b;
		System.out.println("Div is:"+d);
	}
	public static void main(String[] args)
	{
		operations op = new operations();
		op.calcSum();
		op.calcSub();
		op.calcMul();
		op.calcDiv();
	}
}
