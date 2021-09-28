package Practice;

class GolfCulb{
	
	static int num = 7;
	static String name = "아이언";
	
	public GolfCulb(int n) {
		this.num = n;
	}

	public GolfCulb() {
	}

	public GolfCulb(String name) {
		this.name = name;
		this.num = 0;
	}

	static void print() {
		if(num == 0) {
			System.out.println(name+"입니다");
		}
		else
			System.out.println(num + "번 "+name+"입니다");
	}
}

public class GolfClubTest {

	public static void main(String[] args) {
		GolfCulb g1 = new GolfCulb();
		g1.print();
		GolfCulb g2 = new GolfCulb(8);
		g2.print();
		GolfCulb g3 = new GolfCulb("퍼터");
		g3.print();
		
		
	}

}
