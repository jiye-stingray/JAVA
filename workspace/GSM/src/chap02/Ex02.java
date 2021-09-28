package chap02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num >= 90) System.out.println("A");
		else if(num>= 80) System.out.println("B");
		else if(num >= 70) System.out.println("C");
		else if(num >= 60) System.out.println("D");
		else if(num < 60)System.out.println("F");
		
		switch(num/10)
		{
		    case 10: System.out.println("축하합니다");
			case 9: System.out.println("A"); break;
			case 8: System.out.println("B"); break;
			case 7: System.out.println("C"); break;
			case 6: System.out.println("D"); break;
			default: System.out.println("F"); break;
		}
		
	}

}
