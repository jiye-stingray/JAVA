package chap02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//짝수 홀수 구분
		/*
		 * System.out.println("숫자를 입력하게세요");
		 * 
		 * float num = sc.nextFloat();
		 * 
		 * System.out.println((num%2 ==0)?"짝수":"홀수");
		 */
		
		//3의 배수 구분
		System.out.println("숫자를 입력하세요");
		float num = sc.nextFloat();
		System.out.println((num%3 == 0)&&(num%5 ==0)? "3의 배수이면서 5의배수":"아님");

	}
	
	

}
