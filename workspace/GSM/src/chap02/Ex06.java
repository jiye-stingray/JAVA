package chap02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 5�������� �Է� ���� ����� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0;i < 5;i++) {
			int num = sc.nextInt();
			if(num<0) 
				continue;
			sum += num;
		}
		System.out.println(sum);
	}

}
