package sangsi;
class Car{
	String carname;
	
	String color = "검정색";
	
	void show1() {
		System.out.println("나의 트럭은 "+color+"이다");
	}
	
	void show2() {
		System.out.println(carname+"는 실을 수 없다");
	}
}
class Truck extends Car{
	int ton;
	@Override
	void show2() {
		System.out.println("carname"+ton+"톤 을 실을 수 있다");
	}
}

public class TruckTest {

	public static void main(String[] args) {
		Truck myTruck = new Truck();
		myTruck.carname = "프론티어";
		myTruck.ton = 3;
		myTruck.show1();
		myTruck.show2();

	}

}
