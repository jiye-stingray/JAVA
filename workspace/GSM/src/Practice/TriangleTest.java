package Practice;

class Triangle{
	double base;
	double height;
	double area;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	
	}
	double findArea(){
		
		area = base * height * 0.5;
		return area;
	}
	
	boolean isSameArea(Triangle t) {
		area = findArea();
		return (area == t.findArea());
	}
	
}

public class TriangleTest {

	public static void main(String[] args) {
	
		/*
		 * Triangle t = new Triangle(10.0,5.0);
		 * System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ´Â "+t.findArea());
		 */
		
		Triangle t1 = new Triangle(10.0,5.0);
		Triangle t2 = new Triangle(5.0,10.0);
		Triangle t3 = new Triangle(8.0,8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
		
		
		
	}

}
