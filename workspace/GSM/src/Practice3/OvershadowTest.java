package Practice3;
class Parent{
	String name = "����";
	void Print() {
		System.out.println(name);
	}
}
class Child extends Parent{
	String name = "�絵����";
	void Print() {
		System.out.println("���� "+name+"�̴�.");
	}
}

public class OvershadowTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		p.Print();
		c.Print();

	}

}
