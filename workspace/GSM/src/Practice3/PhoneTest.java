package Practice3;
class Phone{
	protected String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	void talk() {
		System.out.println(owner+"가 통화중이다");
	}
}
class Telephone extends Phone{
	private String when;
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	
	void autoAnswering() {
		System.out.println(owner+"가 없다."+when+"가 없다");
	}
	
}
class Smartphone extends Phone {
	private String game;
	public Smartphone(String owner, String game) {
		super(owner);
		this.game = game;
	}
	
	void SmartPhone() {
		System.out.println(owner+"가 "+game+"게임을 하는중이다");
	}
}

public class PhoneTest {

	public static void main(String[] args) {
		Phone[] phones = {new Phone("황진이"),new Telephone("길동이","내일"),new Smartphone("민국이","갤러그")};
		
		phones[0].talk();
		((Telephone)phones[1]).autoAnswering();
		((Smartphone)phones[2]).SmartPhone();

	}

}
