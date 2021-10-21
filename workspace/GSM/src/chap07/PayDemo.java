package chap07;

interface Pay{
	public void PayMent();
}
class CardPay implements Pay{

	@Override
	public void PayMent() {
		System.out.println("ī��");
	}
	
}

class CashPay implements Pay{

	@Override
	public void PayMent() {
		System.out.println("����");
		
	}
}
class PaymentService{
	Pay pay;
	private final String Credit_Card = "ī�����";
	private final String Cash = "���ݰ���";
	
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
		a.process("ī�����");

	}

}
