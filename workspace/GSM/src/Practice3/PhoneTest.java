package Practice3;
class Phone{
	protected String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	void talk() {
		System.out.println(owner+"�� ��ȭ���̴�");
	}
}
class Telephone extends Phone{
	private String when;
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	
	void autoAnswering() {
		System.out.println(owner+"�� ����."+when+"�� ����");
	}
	
}
class Smartphone extends Phone {
	private String game;
	public Smartphone(String owner, String game) {
		super(owner);
		this.game = game;
	}
	
	void SmartPhone() {
		System.out.println(owner+"�� "+game+"������ �ϴ����̴�");
	}
}

public class PhoneTest {

	public static void main(String[] args) {
		Phone[] phones = {new Phone("Ȳ����"),new Telephone("�浿��","����"),new Smartphone("�α���","������")};
		
		phones[0].talk();
		((Telephone)phones[1]).autoAnswering();
		((Smartphone)phones[2]).SmartPhone();

	}

}
