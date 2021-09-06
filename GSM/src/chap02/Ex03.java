package chap02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int s = 0;
//		for(int i = 1; i <= 10; i++)
//		{
//			
//			if(i == 10) System.out.print( i );
//			else System.out.print(i + "+"  );
//			s += i;
//		}
//		System.out.println("=" + s);
		
		
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int num = sc.nextInt();
//		
		int s =0;
//		while(num != -1){
//			System.out.println("또 입력해보세요");
//			s += num;
//			num = sc.nextInt();
//		}
//		System.out.println(s);
		
		
		for(int i = 0; i != -1;)
		{
			System.out.println("숫자를 입력하세요");
			i = sc.nextInt();
			if(i == -1) break;
			s += i;
		}
		System.out.println(s);
	}

}
