package chap06;

public class People {
	String name;
	int ssn;
	
	public People(String name, int ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}
	//메서드 오버라이딩
	void fall() {
		System.out.println("나는 사람입니다");
	}

}
