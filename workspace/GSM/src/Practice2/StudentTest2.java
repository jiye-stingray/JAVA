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
			int temp = scores[i]/10;
			if(temp >= 10) {
				System.out.println((i+1) + "�� �л��� ����� A�Դϴ�"); 
			}
				
			else if((temp <= 9) && (temp >= 8)) {
				System.out.println((i+1) + "�� �л��� ����� B�Դϴ�");
			}
			else if((temp < 8) && (temp >= 7)) {
				System.out.println((i+1) + "�� �л��� ����� C�Դϴ�");
			}
			else if(temp < 7 && (temp >= 6)){
				System.out.println((i+1) + "�� �л��� ����� D�Դϴ�");
			}
			else if(temp < 6) {
				System.out.println((i+1) + "�� �л��� ����� E�Դϴ�");
			}
		}

	}

}
