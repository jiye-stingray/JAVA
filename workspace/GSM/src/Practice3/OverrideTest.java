package Practice3;

class Vehicle{
	String color;
	int speed;
	
	void show() {
		System.out.println("????: "+color+" ?ӵ?: "+speed);
	}
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
}
class Car extends Vehicle{
	int displacement;
	int gears;
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color,speed);
		this.displacement = displacement;
		this.gears = gears;
		
	}

	void show() {
		System.out.println("????: "+color+" ?ӵ?: "+speed+" ???ⷮ: "+displacement+" ?????ܼ?: "+gears);
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		Car c = new Car("?Ķ?",200,1000,5);
		
		c.show();
		
		System.out.println();
		Vehicle v = c;
		v.show();

	}

}
