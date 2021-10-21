package chap07;

abstract class Human{
	public abstract void sleep();
	public abstract void say();
}
class Minjun extends Human{

	@Override
	public void sleep() {
		System.out.println("민준이는 잠을 잔다");
		
	}

	@Override
	public void say() {
		System.out.println("민준이는 말한다");
		
	}
	
}

public class HumanTest {

	public static void main(String[] args) {
		Minjun min = new Minjun();
		
		min.say();
		min.sleep();

	}

}
