package Practice2;

import java.util.Scanner;

public class StudentsTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfStudents = 0;
		int[] scores;
		
		numOfStudents = sc.nextInt();
		scores = new int[numOfStudents];
		
		
		System.out.println(numOfStudents+"명의 학생 성적을 입력하세요");
		for(int i = 0; i < numOfStudents; i++) {
			scores[i] = sc.nextInt();
		}
		System.out.println(numOfStudents+"명의 학생 성적은 다음과 같습니다");
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] );
		}
		
	}

}
