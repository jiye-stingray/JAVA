package chap06;


public class DmCellPhoneTest {

	public static void main(String[] args) {
		DmCellPhone dm = new DmCellPhone("자바폰","검정",10);
		
		System.out.println(dm.model);
		System.out.println(dm.color);
		System.out.println(dm.channel);
		
		dm.powerOn();
		dm.bell();
		dm.sendVoice("여보세요");
		dm.reciveVoice("안녕하세요~ 저는 박지예입니다");
		dm.sendVoice("아~ 반갑습니다.");
		dm.hangUp();
		
		dm.turnOnDmb();
		dm.ChangeChannel(12);
		dm.turnOfDmb();

	}

}
