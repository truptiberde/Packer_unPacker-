package assignment1;

class Use_Rectangle{
	public static void main(String[] args)
	{
		Rectangle rect=new Rectangle();
		rect.length=7;
		rect.width=3;
		System.out.println("Length="+rect.length);
		System.out.println("Width="+rect.width);
		rect.Area();
		rect.Perimeter();
	}
}
