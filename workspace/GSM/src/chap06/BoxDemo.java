package chap06;

class Box{
	public Box(){
		System.out.println("������");
	}
	
}
class ColoredBox extends Box{
	public ColoredBox() {
		System.out.println("���");
	}
}
public class BoxDemo {

	public static void main(String[] args) {
		//�θ� ������ ���� ����
		ColoredBox cb = new ColoredBox();

	}

}
