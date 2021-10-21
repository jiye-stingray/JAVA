package chap07;

// ����� �������̽�
interface Wearable2 {
    void putOn();   // �Ա�
    void putOff();  // ����
}

// ��ĥ �������̽�
interface Colorable {
    int RED = 1;    // ����
    int GREEN = 2;  // �ʷ�
    int BLUE = 3;   // �Ķ�
    //void change(int color); // ������
}

class WearableRobot2 implements Wearable2, Colorable {
    private int color;  // ��
    WearableRobot2(int color) {changeColor(color);}
    public void changeColor(int color) {this.color=color;}
    public String toString () {
       switch(color) {
       case RED : return "���� �κ�";
       case GREEN : return "�ʷ� �κ�";
       case BLUE : return "�Ķ� �κ�";
        }
        return "�κ�";
    }
    public void putOn() {
        System.out.println(toString()+" ����!!");
    }
    public void putOff() {
        System.out.println(toString()+" ����!!");
    }
}

public class Wearable2Demo{
	public static void main(String[] args) {
		WearableRobot2 s = new WearableRobot2(1);
		s.putOn();
		s.putOff();
		

	}
}


