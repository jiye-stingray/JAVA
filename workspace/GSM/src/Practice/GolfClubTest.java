package Practice;

class GolfCulb{
	
	static int num = 7;
	static String name = "���̾�";
	
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
			System.out.println(name+"�Դϴ�");
		}
		else
			System.out.println(num + "�� "+name+"�Դϴ�");
	}
}

public class GolfClubTest {

	public static void main(String[] args) {
		GolfCulb g1 = new GolfCulb();
		g1.print();
		GolfCulb g2 = new GolfCulb(8);
		g2.print();
		GolfCulb g3 = new GolfCulb("����");
		g3.print();
		
		
	}

}
