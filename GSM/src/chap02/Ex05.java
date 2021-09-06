package chap02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*for(int i = 1; i <10; i++ ) {
			System.out.println(i +" * 2 =" + i*2);
		}*/
		
		
		/*
		 * for(int i = 1; i<10;i++) { for(int j=1; j<10;j++) {
		 * System.out.println(i+"*"+j +"="+i*j);
		 * 
		 * } System.out.println(); }
		 */
		
		System.out.println("구구단을 알고  싶은 숫자를 입력해보세요");
		int num = sc.nextInt();
		for(int i = 1; i <10; i++ ) {
		System.out.println(num +" * " + i +" = " + i*num);
		}
		
	}

}
