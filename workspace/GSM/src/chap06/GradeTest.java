package chap06;

import java.util.Scanner;

class Grade{
	int math;
	int kor;
	int eng;
	public Grade(int math, int kor, int eng) {
		this.math = math;
		this.kor = kor;
		this.eng = eng;
	}
	int Sum() {
		return math + kor + eng;
	}
	double avg() {
		return (math + kor + eng)/3;
	}
}

public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ ������ �Է��ϼ���");
		int m = sc.nextInt();
		int k = sc.nextInt();
		int e = sc.nextInt();
		Grade g = new Grade(m,k,e);
		
		System.out.println("�հ�: "+ g.Sum());
		System.out.println("���: "+g.avg());

	}

}