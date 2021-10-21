package chap07;

interface Pay{
	public void PayMent();
}
class CardPay implements Pay{

	@Override
	public void PayMent() {
		System.out.println("카드");
	}
	
}

class CashPay implements Pay{

	@Override
	public void PayMent() {
		System.out.println("현금");
		
	}
}
class PaymentService{
	Pay pay;
	private final String Credit_Card = "카드결제";
	private final String Cash = "현금결제";
	
	public void process(String option) {
		if(option.equals(option)) {
			pay = new CardPay();
		}
		else if (option.equals(Cash)) {
			pay = new CashPay();
		}
		pay.PayMent();
	}
	
}

public class PayDemo {

	public static void main(String[] args) {
		PaymentService a = new PaymentService();
		a.process("카드결제");

	}

}
