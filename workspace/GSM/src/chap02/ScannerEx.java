package chap02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸�, ����, ����, ü��, �̱� ���θ� ��ĭ���� �����Ͽ� �Է��ϼ���");
		String name = scanner.next();
		//String name = new String();
		System.out.println("�̸��� "+ name+" �̰�" );
		
		String city = scanner.next();
		System.out.println("��� ���� "+ city + "�Դϴ�");
		
		int age = scanner.nextInt();
		System.out.println("���̴� "+ age+ "  �̰�");
		
		float weight = scanner.nextFloat();
		System.out.println("ü���� "+ weight+ " �̰�");
		
		boolean issingle = scanner.nextBoolean();
		
		if(issingle)
			System.out.println("�̱��Դϴ�");
		else System.out.println("�̱��� �ƴմϴ�");

	}

}