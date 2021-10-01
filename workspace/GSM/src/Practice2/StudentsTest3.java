package Practice2;

import java.util.Scanner;

enum Lank{
	 A("최우수"),B("우수"),C("보통"),D("미흡"),E("탈락");
	
	final String lank;

	Lank(String lank) {
		this.lank = lank;
	}
	
	public String getlank() {
		return lank;
	}
}

public class StudentsTest3 {
	
	

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
		
		Lank stlank = null;
		for(int i = 0; i< scores.length; i++) {
			
			int temp = scores[i]/10;
			if(temp >= 10) {
				stlank = stlank.A;
			}
			else if((temp <= 9) && (temp >= 8)) {
				stlank = stlank.B;
			}
			else if((temp < 8) && (temp >= 7)) {
				stlank = stlank.C;
			}
			else if(temp < 7 && (temp >= 6)){
				stlank = stlank.D;
			}
			else if(temp < 6) {
				stlank = stlank.E;
			}
			System.out.println((i+1) + "번 학생의 등급은 "+stlank.getlank());
		}

	}

}