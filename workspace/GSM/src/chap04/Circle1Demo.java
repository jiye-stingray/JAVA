package chap04;

//private_접근자(getter), 설정자(setter)
class Circle1{
	private double radius;
	
	public void setter(double radius) {
		this.radius = radius;
	}
	
	public double getter() {
		return radius;
	}
	
	double findArea() {
		return radius * radius * 3.14;
	}
	
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	

	void show(double radius, double area) {
		System.out.printf("반지름: %.1f 원의 넓이 : %.1f", radius,area);
	}
	
}

public class Circle1Demo {

	public static void main(String[] args) {
		
		Circle1 cir = new Circle1();
		
		//cir.radius = 10.0;
		cir.setter(10.0);
		//cir.show();
		
		cir.show(cir.getter(),cir.findArea());
	}
}
