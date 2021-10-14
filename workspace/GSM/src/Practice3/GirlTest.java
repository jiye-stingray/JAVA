package Practice3;
class GoodGirl extends Girl{
	void show() {
		System.out.println(getName()+"는 자바를 잘안다");
	}
	GoodGirl(String name){
		super(name);
	}
}
class BestGirl extends GoodGirl {
	void show() {
		System.out.println( getName()+"는 자바를 무지하게 잘안다");
	}
	BestGirl(String name){
		super(name);
	}
	
}
class Girl{
	private String name;
	void show() {
		System.out.println(name + "는 자바 초보자이다");
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
		
		
		Girl[] girls = {new Girl("갑순이"), new GoodGirl("콩쥐"), new BestGirl("황진이")};
		for(Girl g : girls)
			g.show();
		
	}

}
