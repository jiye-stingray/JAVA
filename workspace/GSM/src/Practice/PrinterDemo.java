package Practice;
class Printer{
	private int numOfPapers = 0;
	private boolean duplex;
	
	
	
	public Printer(int i, boolean b) {
		numOfPapers = i;
		duplex = b;
	}

	public boolean isDuplex() {
		return duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}


	void print(double amount) {
		if(numOfPapers == 0) {
			System.out.println("������ �����ϴ�"); return;
		}
		
		if(duplex) {
			amount = Math.round(amount/2);
			if(amount > numOfPapers) {
				System.out.println("������� ��� ����Ϸ��� "+ (amount - numOfPapers) + "�� �����մϴ�."+
			numOfPapers + "�� �� ����մϴ�"); 
				numOfPapers = 0;
			}
			else {
				numOfPapers -= amount;
				System.out.println("������� "+ amount+"�� ����߽��ϴ�. ���� "+numOfPapers+
						"�� ���� �ֽ��ϴ�.");
			}
			
		}
		else {
			
			if(amount > numOfPapers) {
				System.out.println("�ܸ����� ��� ����Ϸ��� ������ "+ (amount - numOfPapers) + "�� �����մϴ�."+
						 numOfPapers + "�常 ����մϴ�");
				numOfPapers = 0;
			}
			else{
				numOfPapers -= amount;
				System.out.println("�ܸ����� "+ amount + "�� ����߽��ϴ�" + numOfPapers +"���ҽ��ϴ�");
			}
			
		}
		
		
	}
}


public class PrinterDemo {
	public static void main(String[] args) {
		Printer p = new Printer(20,true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);
		
	}

}
