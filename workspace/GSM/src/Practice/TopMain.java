package Practice;

class Top {
	public int a;
	public int b;

	public int sum(int x, int y) {
		return x + y;
	}
}

public class TopMain {

	public static void main(String[] args) {
		Top top = new Top();
		top.a = 100;
		top.b = 200;
		int s = top.sum(top.a, top.b);
		System.out.println("a�� "+top.a);
		System.out.println("b�� "+top.b);
		System.out.println("����� "+ top.sum(top.a, top.b));
		System.out.println("s�� "+ s);
	}

}
