package Practice2;

import java.util.Scanner;

public class StudentTest2 {
	

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
		for(int score : scores) {
			System.out.print(score);
		}
		for(int i = 0; i < scores.length; i++) {
			if(i >= 100) {
				System.out.println((i+1) + "�� �л��� ����� A�Դϴ�"); 
			}
				
			else if(i < 90) {
				System.out.println((i+1) + "�� �л��� ����� B�Դϴ�");
			}
			else if(i < 80) {
				System.out.println((i+1) + "�� �л��� ����� C�Դϴ�");
			}
			else if(i < 70){
				System.out.println((i+1) + "�� �л��� ����� D�Դϴ�");
			}
			else if(i < 60) {
				System.out.println((i+1) + "�� �л��� ����� E�Դϴ�");
			}
		}

	}

}
