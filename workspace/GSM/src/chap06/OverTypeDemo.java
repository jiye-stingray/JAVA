package chap06;

class Vehicle2{
	String name = "Ż��";
	
	void whoami() {
		System.out.println("���� Ż ���Դϴ�");
	}
	
	static void move() {
		System.out.println("�̵��ϴ�. ");
	}
}

class Car2 extends Vehicle2{
	String name = "�ڵ���";
	
	void whoami() {
		System.out.println("���� �ڵ����Դϴ�");
	}
	static void move() {
		System.out.println("�޸���. ");
	}
}

public class OverTypeDemo {

	public static void main(String[] args) {
		Vehicle2 v = new Car2();
		System.out.println(v.name);
		v.whoami();
		v.move();
		
		if(v instanceof Car2) {
			Car2 c = (Car2)v;
			System.out.println(c.name);
			c.whoami();
			c.move();
		}
		
		
	}

}