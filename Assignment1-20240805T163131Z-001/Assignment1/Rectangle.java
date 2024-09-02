package assignment1;

public class Rectangle {

		double length;
		double width;
		
		void Area()
		{
			double area;
				area = this.length*this.width;
			System.out.println("Area of rectangle is:"+area);
		}
		void Perimeter()
		{
			double perimeter;
				perimeter = 2*(this.length*this.width);
			System.out.println("Perimeter of rectangle is:"+perimeter);
		}
	}

	
