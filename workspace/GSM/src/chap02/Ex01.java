package chap02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//¦�� Ȧ�� ����
		/*
		 * System.out.println("���ڸ� �Է��ϰԼ���");
		 * 
		 * float num = sc.nextFloat();
		 * 
		 * System.out.println((num%2 ==0)?"¦��":"Ȧ��");
		 */
		
		//3�� ��� ����
		System.out.println("���ڸ� �Է��ϼ���");
		float num = sc.nextFloat();
		System.out.println((num%3 == 0)&&(num%5 ==0)? "3�� ����̸鼭 5�ǹ��":"�ƴ�");

	}
	
	

}