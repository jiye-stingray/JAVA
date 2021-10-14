package chap06;

class Vehicle2{
	String name = "탈것";
	
	void whoami() {
		System.out.println("나는 탈 것입니다");
	}
	
	static void move() {
		System.out.println("이동하다. ");
	}
}

class Car2 extends Vehicle2{
	String name = "자동차";
	
	void whoami() {
		System.out.println("나는 자동차입니다");
	}
	static void move() {
		System.out.println("달리다. ");
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
