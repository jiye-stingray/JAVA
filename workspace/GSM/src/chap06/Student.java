package chap06;

public class Student extends People {

	int hakbun;
	
	public Student(String name, int hakbun, int ssn) {
		super(name, ssn);
		this.hakbun = hakbun;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void fall() {
		System.out.println("���� ����̸鼭 �л��Դϴ�");
	}

}
