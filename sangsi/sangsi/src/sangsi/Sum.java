package sangsi;

import java.util.Scanner;

//두개의 실수를 입력 받아 합계를 출력
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		System.out.printf("합계: "+"%.1f", (a+b));

	}

}
