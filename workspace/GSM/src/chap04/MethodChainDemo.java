package chap04;

//연속 호출


class Person{
	String name;
	int age;
	
	public Person SetName(String name) {
		this.name = name;
		return this;
	}
	
	public Person SetAge(int age) {
		this.age = age;
		return this;
	}
	
	public void sayHello() {
		System.out.println("안녕! 나는 "+name+"이고, 나이는 "+age+"세야.");
	}
}

public class MethodChainDemo {
	public static void main(String[] args) {
		Person p = new Person();
		
//		p.SetName("jiye");
//		p.SetAge(17);
//		p.sayHello();
		//굳이 메서드를 따로따로 호출하지 않아도 easy하게 가능
		p.SetName("jiye").SetAge(17).sayHello();
	}
	

}
