package Practice3;
class GoodGirl extends Girl{
	void show() {
		System.out.println(getName()+"�� �ڹٸ� �߾ȴ�");
	}
	GoodGirl(String name){
		super(name);
	}
}
class BestGirl extends GoodGirl {
	void show() {
		System.out.println( getName()+"�� �ڹٸ� �����ϰ� �߾ȴ�");
	}
	BestGirl(String name){
		super(name);
	}
	
}
class Girl{
	private String name;
	void show() {
		System.out.println(name + "�� �ڹ� �ʺ����̴�");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Girl(String name){
		this.name = name;
	}
}

public class GirlTest {

	public static void main(String[] args) {
		
		
		Girl[] girls = {new Girl("������"), new GoodGirl("����"), new BestGirl("Ȳ����")};
		for(Girl g : girls)
			g.show();
		
	}

}
