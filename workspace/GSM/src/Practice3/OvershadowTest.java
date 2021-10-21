package Practice3;
class Parent{
	String name = "영조";
	void Print() {
		System.out.println(name);
	}
}
class Child extends Parent{
	String name = "사도세자";
	void Print() {
		System.out.println("나는 "+name+"이다.");
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
