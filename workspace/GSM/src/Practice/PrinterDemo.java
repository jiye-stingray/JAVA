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
			System.out.println("용지가 없습니다"); return;
		}
		
		if(duplex) {
			amount = Math.round(amount/2);
			if(amount > numOfPapers) {
				System.out.println("양면으로 모두 출력하려면 "+ (amount - numOfPapers) + "매 부족합니다."+
			numOfPapers + "장 만 출력합니다"); 
				numOfPapers = 0;
			}
			else {
				numOfPapers -= amount;
				System.out.println("양면으로 "+ amount+"장 출력했습니다. 현재 "+numOfPapers+
						"장 남아 있습니다.");
			}
			
		}
		else {
			
			if(amount > numOfPapers) {
				System.out.println("단면으로 모두 출력하려면 용지가 "+ (amount - numOfPapers) + "매 부족합니다."+
						 numOfPapers + "장만 출력합니다");
				numOfPapers = 0;
			}
			else{
				numOfPapers -= amount;
				System.out.println("단면으로 "+ amount + "장 출력했습니다" + numOfPapers +"남았습니다");
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
