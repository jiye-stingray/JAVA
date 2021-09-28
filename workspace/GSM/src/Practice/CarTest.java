package Practice;
class Car{
	static int carcount;
	static int redCarCount;
	public Car(String color) {
		// TODO Auto-generated constructor stub
		this.color = color;
		carcount++;
		if(color.equals("red")||color.equals("RED")) {
			redCarCount++;
		}
	}

	String color;
	
	static int getNumOfCar() {
		return carcount;
	}
	
	static int getNumOfRedCar() {
		return redCarCount;
	}
}

public class CarTest {


	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("bule");
		Car c3 = new Car("RED");
		
		System.out.printf("자동차 수: %d, 빨간색 자동차 수: %d", Car.getNumOfCar(),Car.getNumOfRedCar());
		

	}

}
