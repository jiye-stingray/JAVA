package chap04;
//this.�� this()
class Circle{
	
	double radius;
	String color;
	
	public Circle(double radius, String color) { //Ŭ���� �ȿ� Ŭ���� �̸��� ������ �޼��尡 ������ �̰Ž� ������
		this.radius = radius;
		this.color = color;
	}

	public Circle() {
		
	}

	public Circle(double radius) {
//		this.radius = radius;
		this(radius,"�ʷ�");
	}

	public Circle(String color) {
//		this.color = color;
//		radius = 3.4;
		this(3.4,color);
	}

	void print() {
		System.out.println(radius + "cm �������� ���� "+ color + "�� ��!");
	}
	
}

public class CircleDemo{

	public static void main(String[] args) {	
		
		Circle c1 = new Circle();
		c1.radius = 5.0;
		c1.color = "����";
		c1.print();
		
		Circle c2 = new Circle(10.0,"���");
		c2.print();
		
		Circle c3 = new Circle(7.0);
		c3.print();
		
		Circle c4 = new Circle("ȸ");
		
		c4.print();
		
		
				
		
	}

}
