package chap06;

public class ColoredCircle extends Circle1{

	String color;
	
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
		
	}



	public void show() {
		System.out.println("�������� "+radius+"�� "+color+" ���̴�");
	}
}
