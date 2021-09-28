package chap04;
//this.과 this()
class Circle{
	
	double radius;
	String color;
	
	public Circle(double radius, String color) { //클래스 안에 클래스 이름과 동일한 메서드가 있을때 이거슨 생성자
		this.radius = radius;
		this.color = color;
	}

	public Circle() {
		
	}

	public Circle(double radius) {
//		this.radius = radius;
		this(radius,"초록");
	}

	public Circle(String color) {
//		this.color = color;
//		radius = 3.4;
		this(3.4,color);
	}

	void print() {
		System.out.println(radius + "cm 반지름을 가진 "+ color + "색 공!");
	}
	
}

public class CircleDemo{

	public static void main(String[] args) {	
		
		Circle c1 = new Circle();
		c1.radius = 5.0;
		c1.color = "빨강";
		c1.print();
		
		Circle c2 = new Circle(10.0,"노랑");
		c2.print();
		
		Circle c3 = new Circle(7.0);
		c3.print();
		
		Circle c4 = new Circle("회");
		
		c4.print();
		
		
				
		
	}

}
