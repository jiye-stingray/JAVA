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
		System.out.println("a는 "+top.a);
		System.out.println("b는 "+top.b);
		System.out.println("결과는 "+ top.sum(top.a, top.b));
		System.out.println("s는 "+ s);
	}

}
