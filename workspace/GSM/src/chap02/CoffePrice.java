package chap02;

import java.util.Scanner;

public class CoffePrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = 0;
		
		System.out.println("���� ���Ḧ �ֹ��Ͻðھ��");
		String order = sc.next();
		
		switch(order)
		{
		case "����������":
		case "�Ƹ޸�ī��": 
			price = 4000; break;
			
		case "īǪġ��": 
			price = 4500; break;
			
			default: price = 5000; break;
		}
		
		System.out.printf("�ֹ��Ͻ� ������ ������ %d�� �Դϴ�",price);
	}

}
