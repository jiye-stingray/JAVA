package Practice;

import java.util.Scanner;

public class factorial {
	//2 �޼���� �ۼ�
	static int factorial(int x) {
		int r = 1;
		
		//���丮�� ���� ����ϴ� �ڵ�
		for(int i = 1; i <=x;i++) {
			r *= i;
		}
		
		return r;
	}
	
	//3��
	static int factorial2(int x, int y) {
		int r = 1;
		//���� ���丮�� ���� ����ϴ� �ڵ�
		for(int i = x; i<=y;i++) {
			r*=i;
		}
		
		return r;
	}
	static int factorial2(int x) { //�޼��� �����ε�
		int r = 1;
		//���� ���丮�� ���� ����ϴ� �ڵ�
		for(int i = 1; i <=x; i++) {
			r *= i;
		}
		
		return 1;
	}
	

	public static void main(String[] args) {
		int result; //���丮�� ��� �� ����
		int n;
		Scanner in = new Scanner(System.in);
		//Ű����� �������� �Է� �ް� ���丮�� ���� ����ϴ� �ڵ�
		System.out.println("���丮�� ���� ���� ����");
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
