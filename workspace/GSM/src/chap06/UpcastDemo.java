package chap06;

class Person{
	String name = "사람";
	
	void whoami() {
		System.out.println("나는 사람이다");
	}
}

class Stud extends Person{
	int number = 7;
	void work() {
		System.out.println("나는 공부한다");
	}
}
public class UpcastDemo {
	public static void main(String[] args) {
		//Person p = new Stud();
//		Person p;
//		p = new Stud();
		
		Person p;
		Stud s = new Stud();
		
		p = s;
		
		//p.number = 1;
		//p.work();
		p.whoami();
	}
}
