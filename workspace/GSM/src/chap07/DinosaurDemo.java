package chap07;
interface Dinosaur{
	public abstract void cry();
}
class T_Rax implements Dinosaur{
	void walk() {
		System.out.println("�ȱ�");
	}

	@Override
	public void cry() {
		System.out.println("�پ���");
	}
}
class Ptera implements Dinosaur{
	void fly() {
		System.out.println("����");
	}

	@Override
	public void cry() {
		System.out.println("������");
		
	}
	
}
public class DinosaurDemo {

	public static void main(String[] args) {
//		T_Rax t = new T_Rax();
//		Ptera p = new Ptera();
//		t.cry();
//		t.walk();
//		p.cry();
//		p.fly();
		
		Dinosaur d[] = {new T_Rax(),new Ptera()};
		
		d[0].cry();
		((T_Rax)d[0]).walk();
		d[1].cry();
		((Ptera)d[1]).fly();
	}

}
