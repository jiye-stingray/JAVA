package chap06;

public class InstanceofDemo {

	public static void main(String[] args) {
		Stud s = new Stud();
		Person p = new Person();
		
		System.out.println(s instanceof Person);
		System.out.println(p instanceof Person);
		System.out.println(s instanceof Stud);
		System.out.println(p instanceof Stud);
		
		downcast(s);
	}

	static void downcast(Person p) {
		if(p instanceof Stud) {
			Stud s = (Stud)p;
			System.out.println("하향 타입 변환 완료");
		}
	}
}
