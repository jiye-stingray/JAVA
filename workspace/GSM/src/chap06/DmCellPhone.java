package chap06;

public class DmCellPhone extends CellPhone {
	//�ʵ�
	int channel;

	//������
	public DmCellPhone(String model, String color, int channel) {
//		this.model = model;
//		this.color = color;
		super(model,color);
		this.channel = channel;
		
	}
	
	
	
	//�޼���
	void turnOnDmb() {
		System.out.println("ä�� "+ channel + "�� DMB��� ������ �����մϴ�.");
	}
	void turnOfDmb() {
		System.out.println("DMB��� ������ ����ϴ�.");
	}
	public void ChangeChannel(int channel) {
		this.channel = channel;
		System.out.println("ä�� "+ channel + "������ �ٲߴϴ�.");
	}

	
	
}
