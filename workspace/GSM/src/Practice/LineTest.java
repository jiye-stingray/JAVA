package Practice;

class Line{
	static int lenght;

	public Line(int lenght) {
		this.lenght = lenght;
	}
	static boolean isSameLine(Line b) {
		return lenght == b.lenght;
	}
}

public class LineTest {

	public static void main(String[] args) {
		Line a = new Line(1);
		Line b = new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a == b);

	}

}
