//package Practice;
//class Printer{
//	private int numOfPapers = 0;
//
//	
//	public Printer(int i) {
//		numOfPapers = i;
//	}
//
//
//	void print(int amount) {
//		
//		if(numOfPapers == 0) {
//			System.out.println("������ �����ϴ�");
//			return;
//		}
//		if(numOfPapers >= amount) {
//			numOfPapers -= amount;
//			System.out.println(amount + "�� ����߽��ϴ�. ���� "+numOfPapers+"�� ���� �ֽ��ϴ�");
//			return;
//		}
//		else {
//			System.out.println("��� ����Ϸ��� ������ "+ (amount - numOfPapers) + "�� �����մϴ�."
//					+ numOfPapers+ "�常 ����մϴ�");
//			numOfPapers = 0;
//			return;
//		}
//		
//		
//	}
//}


//public class PrinterTest {
//	public static void main(String[] args) {
//		Printer p = new Printer(10);
//		
//		p.print(2);
//		p.print(20);
//		p.print(10);
//		
//	}
//
//}
