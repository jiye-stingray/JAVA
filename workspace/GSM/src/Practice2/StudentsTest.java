package Practice2;

import java.util.Scanner;

public class StudentsTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfStudents = 0;
		int[] scores;
		
		numOfStudents = sc.nextInt();
		scores = new int[numOfStudents];
		
		
		System.out.println(numOfStudents+"���� �л� ������ �Է��ϼ���");
		for(int i = 0; i < numOfStudents; i++) {
			scores[i] = sc.nextInt();
		}
		System.out.println(numOfStudents+"���� �л� ������ ������ �����ϴ�");
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] );
		}
		
	}

}
