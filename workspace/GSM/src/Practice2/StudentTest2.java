package Practice2;

import java.util.Scanner;

public class StudentTest2 {
	

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
		for(int score : scores) {
			System.out.print(score);
		}
		for(int i = 0; i < scores.length; i++) {
			int temp = scores[i]/10;
			if(temp >= 10) {
				System.out.println((i+1) + "번 학생의 등급은 A입니다"); 
			}
				
			else if((temp <= 9) && (temp >= 8)) {
				System.out.println((i+1) + "번 학생의 등급은 B입니다");
			}
			else if((temp < 8) && (temp >= 7)) {
				System.out.println((i+1) + "번 학생의 등급은 C입니다");
			}
			else if(temp < 7 && (temp >= 6)){
				System.out.println((i+1) + "번 학생의 등급은 D입니다");
			}
			else if(temp < 6) {
				System.out.println((i+1) + "번 학생의 등급은 E입니다");
			}
		}

	}

}
