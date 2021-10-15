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
		System.out.println("규칙");
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
		System.out.println("야구 규칙을 따른다");
	}
}
class PingPong extends Sports{
	public PingPong(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	String team = "복식";
	
	void rule() {
		System.out.println("탁구 규칙을 따름");
	}
}

public class SportTest {

	public static void main(String[] args) {
		
		Sports[] sp = {new BaseBall("BaseBall",9),  new PingPong("PingPong")};
	
		int cnt = 0;
		
		for(Sports s : sp) {
			System.out.println("경기종목: "+s.getName());
			if(cnt == 1) {
				System.out.println("플레이어: "+ ((PingPong)s).team);
			}
			else
				System.out.println("플레이어: "+ ((BaseBall)s).player);
			System.out.printf("경기규칙: ");
			s.rule();
			cnt++;
			
		}
		
		
	}

}
