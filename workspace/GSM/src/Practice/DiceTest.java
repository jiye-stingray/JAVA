package Practice;

class Dice{
	static int face;
	static int roll() {
		face = (int)((Math.random()*6)+1);
		return face;
	}
}

public class DiceTest {

	public static void main(String[] args) {
		Dice d = new Dice();
		
		System.out.println("�ֻ����� ����: "+d.roll());

	}

}
