package chap06;

public class StudentTest {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("박지예",1204, 123456);
		Student st2 = new Student("전지훈",1215,78910);
		
		System.out.println(st1.name +" "+ st1.hakbun +" "+  st1.ssn);
		System.out.println(st2.name +" "+ st2.hakbun +" "+ st2.ssn);
		
		st1.fall();

	}

}
