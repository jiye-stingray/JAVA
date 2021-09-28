package chap06;

public class AnimalTest {

	public static void main(String[] args) {
		Eagle e1 = new Eagle();
		System.out.println("독수리는");
		e1.mouth = 1;
		e1.wing = 2;
		e1.eat();
		e1.fly();
		e1.sleep();
		System.out.println("호랑이는");
		Tiger t1 = new Tiger();
		t1.leg = 4;
		t1.mouth = 1;
		t1.eat();
		t1.sleep();
		t1.run();
		System.out.println("금붕어는");
		GoldFish g1 = new GoldFish();
		g1.fin = 6;
		g1.mouth = 1;
		g1.eat();
		g1.sleep();
		g1.swim();

	}

}
