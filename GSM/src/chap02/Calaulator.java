package chap02;

import java.util.Scanner;

public class Calaulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 숫자를 구분해서입력해 보세요");
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.println(num1+ " + "+ num2 +" = "+ (num1+num2));
		System.out.println(num1+ " - "+ num2 +" = "+ (num1-num2));
		System.out.println(num1+ " * "+ num2 +" = "+ (num1*num2));
		System.out.println(num1+ " / "+ num2 +" = "+ (num1/num2));
		

	}

}
