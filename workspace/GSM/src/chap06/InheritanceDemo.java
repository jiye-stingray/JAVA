package chap06;

public class InheritanceDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("������");
		
		System.out.println("�� : ");
		//c1.secret();
		c1.findRadius();
		c1.findArea();
		
		System.out.println("��: "); 
		c2.findRadius();	//��� ����
		//c2.findcolor();
		c2.findArea();	
		//�޼��� �������̵� : �θ� Ŭ������ �޼��尡 �ڽ� Ŭ������ �޼��忡�� �����ϴٸ� �״�� ����� �� �ִ�
					//  ������ �������� �ʴٸ� �ڽ� Ŭ������ �������� 
					//  �޼��带 �ڽſ��� �µ��� �����ؾ��Ѵ�. �̸� �޼��� �������̵��̶� �Ѵ�.
 	}

}
