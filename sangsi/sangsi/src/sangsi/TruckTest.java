package sangsi;
class Car{
	String carname;
	
	String color = "������";
	
	void show1() {
		System.out.println("���� Ʈ���� "+color+"�̴�");
	}
	
	void show2() {
		System.out.println(carname+"�� ���� �� ����");
	}
}
class Truck extends Car{
	int ton;
	@Override
	void show2() {
		System.out.println("carname"+ton+"�� �� ���� �� �ִ�");
	}
}

public class TruckTest {

	public static void main(String[] args) {
		Truck myTruck = new Truck();
		myTruck.carname = "����Ƽ��";
		myTruck.ton = 3;
		myTruck.show1();
		myTruck.show2();

	}

}
