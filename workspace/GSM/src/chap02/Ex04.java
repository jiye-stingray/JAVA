package chap02;

import java.util.Scanner;

public class Ex04 {
	
	static void alpha()
	{
		char al = 'a';
		do {
			
			System.out.print(al+ " ");
			al++;
			
		}while(al <= 'z');
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		alpha();
		
	}

}
