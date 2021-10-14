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
		System.out.println("수학, 국어, 영어 순으로 점수를 입력하세요");
		int m = sc.nextInt();
		int k = sc.nextInt();
		int e = sc.nextInt();
		Grade g = new Grade(m,k,e);
		
		System.out.println("합계: "+ g.Sum());
		System.out.println("평균: "+g.avg());

	}

}
