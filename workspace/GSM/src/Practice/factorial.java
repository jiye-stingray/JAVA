package Practice;

import java.util.Scanner;

public class factorial {
	//2 메서드로 작성
	static int factorial(int x) {
		int r = 1;
		
		//팩토리얼 값을 계산하는 코드
		for(int i = 1; i <=x;i++) {
			r *= i;
		}
		
		return r;
	}
	
	//3번
	static int factorial2(int x, int y) {
		int r = 1;
		//구간 팩토리얼 값을 계산하는 코드
		for(int i = x; i<=y;i++) {
			r*=i;
		}
		
		return r;
	}
	static int factorial2(int x) { //메서드 오버로딩
		int r = 1;
		//구간 팩토리얼 값을 계산하는 코드
		for(int i = 1; i <=x; i++) {
			r *= i;
		}
		
		return 1;
	}
	

	public static void main(String[] args) {
		int result; //팩토리얼 결과 값 저장
		int n;
		Scanner in = new Scanner(System.in);
		//키보드로 정수값을 입력 받고 팩토리얼 값을 계산하는 코드
		System.out.println("팩토리얼 값을 구할 정수");
		n = in.nextInt();
		
		//1-3
//		result = 1;
//		while(n>0) {
//			result*=n;
//			n--;
//		}
		
		//1-5
//		result = 1;
//		while(true) {
//			if(n<=0) {
//				break; 
//			}
//			result *= n;
//			n--;
//		}
		
		result = factorial(n);
		System.out.println(result);
		
		System.out.println(factorial2(5));
		System.out.println(factorial2(1,5));
		System.out.println(factorial2(3,5));
		System.out.println(factorial2(10,5));

		

	}

}
