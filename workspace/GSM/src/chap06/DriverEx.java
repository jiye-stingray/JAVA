package chap06;

class Vehicle{
	public void run() {
		System.out.println("������ �޸��ϴ�");
	}
}

class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�");
	}
}

class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�");
	}
}
public class DriverEx {

	public static void main(String[] args) {
		Driver d = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		d.drive(t);
		d.drive(b);
		
	}

}
class Driver{
	public void drive(Vehicle v) {
		v.run();
	}
}