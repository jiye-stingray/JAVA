package chap02;

import java.util.Scanner;

public class Calaulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연산자를 입력하세요");
		
		String opr = sc.next();
		
		System.out.println("두 숫자를 구분해서입력해 보세요");
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		/*
		 * System.out.println(num1+ opr + num2 +" = "+ (num1+num2));
		 * System.out.println(num1+ " - "+ num2 +" = "+ (num1-num2));
		 * System.out.println(num1+ " * "+ num2 +" = "+ (num1*num2));
		 * System.out.printf(num1+ " / "+ num2 +" = "+ "%.3f",(num1/num2));
		 * System.out.println(1); System.out.println(num1+ " % "+ num2 +" = "+
		 * (num1%num2));
		 */
		
		System.out.print(num1 + opr + num2 + "=");
		if(opr.equals("+")) System.out.println((num1 + num2));
		else if(opr.equals("-")) System.out.println(num1 - num2);
		else if(opr.equals("*")) System.out.println(num1 * num2);
		else if(opr.equals("/")) System.out.println(num1 / num2);
		else if(opr.equals("%")) System.out.println(num1 + num2);
	}

}
