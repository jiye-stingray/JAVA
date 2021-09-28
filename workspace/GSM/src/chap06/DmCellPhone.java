package chap06;

public class DmCellPhone extends CellPhone {
	//필드
	int channel;

	//생성자
	public DmCellPhone(String model, String color, int channel) {
//		this.model = model;
//		this.color = color;
		super(model,color);
		this.channel = channel;
		
	}
	
	
	
	//메서드
	void turnOnDmb() {
		System.out.println("채널 "+ channel + "번 DMB방송 수신을 시작합니다.");
	}
	void turnOfDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
	public void ChangeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 "+ channel + "번으로 바꿉니다.");
	}

	
	
}
