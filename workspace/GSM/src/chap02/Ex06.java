package chap02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 5개의정수 입력 그중 양수만 더하기
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
