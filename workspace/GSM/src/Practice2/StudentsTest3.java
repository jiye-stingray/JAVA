package Practice2;

import java.util.Scanner;

enum Lank{
	 A("�ֿ��"),B("���"),C("����"),D("����"),E("Ż��");
	
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
		
		
		System.out.println(numOfStudents+"���� �л� ������ �Է��ϼ���");
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
			System.out.println((i+1) + "�� �л��� ����� "+stlank.getlank());
		}

	}

}