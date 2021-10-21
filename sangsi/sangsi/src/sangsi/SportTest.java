package sangsi;

class Sports{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void rule() {
		System.out.println("��Ģ");
	}
	public Sports(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		
	}
}

class BaseBall extends Sports{
	int player;

	public BaseBall(String name, int i) {
		super(name);
		this.player = i;
		// TODO Auto-generated constructor stub
	}

	
	void rule() {
		System.out.println("�߱� ��Ģ�� ������");
	}
}
class PingPong extends Sports{
	public PingPong(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	String team = "����";
	
	void rule() {
		System.out.println("Ź�� ��Ģ�� ����");
	}
}

public class SportTest {

	public static void main(String[] args) {
		
		Sports[] sp = {new BaseBall("BaseBall",9),  new PingPong("PingPong")};
	
		int cnt = 0;
		
		for(Sports s : sp) {
			System.out.println("�������: "+s.getName());
			if(cnt == 1) {
				System.out.println("�÷��̾�: "+ ((PingPong)s).team);
			}
			else
				System.out.println("�÷��̾�: "+ ((BaseBall)s).player);
			System.out.printf("����Ģ: ");
			s.rule();
			cnt++;
			
		}
		
		
	}

}