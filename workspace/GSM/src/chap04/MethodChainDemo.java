package chap04;

//���� ȣ��


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
		System.out.println("�ȳ�! ���� "+name+"�̰�, ���̴� "+age+"����.");
	}
}

public class MethodChainDemo {
	public static void main(String[] args) {
		Person p = new Person();
		
//		p.SetName("jiye");
//		p.SetAge(17);
//		p.sayHello();
		//���� �޼��带 ���ε��� ȣ������ �ʾƵ� easy�ϰ� ����
		p.SetName("jiye").SetAge(17).sayHello();
	}
	

}
