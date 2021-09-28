package chap04;

//정적 멤버
class Circle2{
	double radius;
	static int numOfCircles = 0;
	int numCircles = 0;
	
	//생성자
	public Circle2(double radius) {
		this.radius = radius;
		numOfCircles++;
		numCircles++;
	}
}

public class Circle2Demo {

	public static void main(String[] args) {	
		Circle2 myCircle = new Circle2(10.0);
		Circle2 yourCircle = new Circle2(5.0);
		
		System.out.println("원의 갯수: "+Circle2.numOfCircles);
		System.out.println("원의 갯수!: "+myCircle.numCircles);
		System.out.println("원의 갯수!: "+yourCircle.numCircles);

	}

}
