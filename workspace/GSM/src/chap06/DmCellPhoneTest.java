package chap06;


public class DmCellPhoneTest {

	public static void main(String[] args) {
		DmCellPhone dm = new DmCellPhone("�ڹ���","����",10);
		
		System.out.println(dm.model);
		System.out.println(dm.color);
		System.out.println(dm.channel);
		
		dm.powerOn();
		dm.bell();
		dm.sendVoice("��������");
		dm.reciveVoice("�ȳ��ϼ���~ ���� �������Դϴ�");
		dm.sendVoice("��~ �ݰ����ϴ�.");
		dm.hangUp();
		
		dm.turnOnDmb();
		dm.ChangeChannel(12);
		dm.turnOfDmb();

	}

}
