package chap02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름, 도시, 나이, 체중, 싱글 여부를 빈칸으로 구분하여 입력하세요");
		String name = scanner.next();
		//String name = new String();
		System.out.println("이름은 "+ name+" 이고" );
		
		String city = scanner.next();
		System.out.println("사는 곳은 "+ city + "입니다");
		
		int age = scanner.nextInt();
		System.out.println("나이는 "+ age+ "  이고");
		
		float weight = scanner.nextFloat();
		System.out.println("체중은 "+ weight+ " 이고");
		
		boolean issingle = scanner.nextBoolean();
		
		if(issingle)
			System.out.println("싱글입니다");
		else System.out.println("싱글이 아닙니다");

	}

}
