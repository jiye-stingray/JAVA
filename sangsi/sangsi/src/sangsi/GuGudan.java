package sangsi;

import java.util.Scanner;

public class GuGudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int n = sc.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.println(n +" * " +i +" = "+ i*n );
		}
	}
}
