package Practice;

import java.util.Scanner;

public class Programing_Study {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1
//		System.out.println("���̸� �Է��ϼ���");
//		int age = sc.nextInt();
//		System.out.println((age>=19)? "����": "�̼���");
		
		//2
//		System.out.println("����� �Է��ϼ���");
//		int rank = sc.nextInt();
//		String finish ="";
//		switch(rank) {
//		case 1: finish = "���� ���߽��ϴ�"; break;
//		case 2: 
//		case 3: finish = "�����Դϴ�"; break;
//		case 4:
//		case 5:
//		case 6:
//			finish = "�����Դϴ�"; break;
//		default: finish = "����ؾ߰ڽ��ϴ�"; break;
//		}
//
//		System.out.println(finish);
		
		//3
//		int n;
//		int s = 0;
//		do {
//			System.out.println("���� ������ �Է��ϼ���");
//			n = sc.nextInt();
//			if(n%2 == 0) {
//				s+= n;
//			}
//		}while(n > 0);	
//		System.out.println("�Է��� ���� ���� �߿��� ¦���� ����"+ s);
		
		//4
//		for(int i = 1; i <=5; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			for(int j = 5; j > i; j--) {
//				System.out.print(" ");
//			}
//			System.out.println("");
//		}
		
		//5 �̿�
		for(int a = 1; a <= 20; a++) {
			for(int b = 1; b <= 20; b++) {
				int c = (int) Math.pow(a, 2) + (int) Math.pow(b, 2) ;
				c = (int) Math.sqrt(c);
				if(a + b + c <= 20) {
					System.out.println(a+ " " + b + " "+ c);
				}
				
			}
		}
		
		//6
//		String b;
//		String g;
//		System.out.println("ö��: ");
//		b = sc.next();
//		System.out.println("����: ");
//		g= sc.next();
//		int cheak = 0;
//		if(b.equals(g)) cheak = 0;
//		else if(b.equals("r")) {
//			if(g.equals("s")) cheak = 1;
//			else if(g.equals("p")) cheak = 2;
//		}
//		else if(b.equals("s")) {
//			if(g.equals("r")) cheak = 2;
//			else if(g.equals("p")) cheak = 1;
//		}
//		else if(b.equals("p")) {
//			if(g.equals("r")) cheak = 1;
//			else if(g.equals("s")) cheak = 2;
//			
//		}
//		switch(cheak) {
//		case 0: System.out.println("���º�"); break;
//		case 1: System.out.println("ö�� ��"); break;
//		case 2: System.out.println("���� ��"); break;
//		}
		
		//7
		/*
		 * String c = input("ö��"); String y = input("����"); whosWin(c,y);
		 */
		
		//8
		/*
		 * for(int i = 1; i <= 5; i++) { printStar(i); System.out.println(); }
		 */
		
		
		//9
		/*
		 * foo("�ȳ�",1); foo("�ȳ��ϼ���",1,2); foo("�� �־�");
		 */
		
		//10
		/*
		 * System.out.println("���� ������ �Է��ϼ���: "); int num = sc.nextInt();
		 * if(isPrime(num)) System.out.println(num + "�� �Ҽ� �Դϴ�"); else
		 * System.out.println(num + "�� �Ҽ��� �ƴմϴ�");
		 */
		
	}

	private static boolean isPrime(int num) {
		for(int i = 2; i <= num; i++) {
			if(num%i==0) {
				if(i == num) return true;
				else return false;
			}
		}
		return false;
		
	}

	private static void printStar(int i) {
		for(int j = 0; j <i; j++) {
			System.out.print("*");
		}
		
	}

	private static void foo(String string, int i) {
		System.out.println(string + " " + i);
		
	}

	private static void foo(String string, int i, int j) {
		System.out.println(string + " " + i + " " + j );
		
	}

	private static void foo(String string) {
		
		System.out.println(string);
	}

	private static void whosWin(String b, String g) {
		int cheak = 0;
		if(b.equals(g)) cheak = 0;
		else if(b.equals("r")) {
			if(g.equals("s")) cheak = 1;
		else if(g.equals("p")) cheak = 2;
		}
	else if(b.equals("s")) {
		if(g.equals("r")) cheak = 2;	
			else if(g.equals("p")) cheak = 1;
		}
		else if(b.equals("p")) {
			if(g.equals("r")) cheak = 1;
			else if(g.equals("s")) cheak = 2;
			
		}
		switch(cheak) {
		case 0: System.out.println("���º�"); break;
		case 1: System.out.println("ö�� ��"); break;
		case 2: System.out.println("���� ��"); break;
	}
	}

	private static String input(String name) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(name + "�� �д�?");
		String pe = sc.next();
		return pe;
	}
	
	
}
