package Practice2;

public class MinerTest {
	public static void main(String[] args) {
		Miner mal = new Miner("����");
		Miner glo = new Miner("�۷θ���");
		
		mal.mine(3);
		glo.mine(2);
		
		mal.print();
		glo.print();
	}

}

class Miner{
	public Miner(String name) {
		this.name = name;
	}
	String name;
	int coins = 0;
	
	void mine(int n) {
		coins += n;
	}
	
	void print() {
		System.out.println("name: "+ name+", "+"coins: "+coins);
	}
}
