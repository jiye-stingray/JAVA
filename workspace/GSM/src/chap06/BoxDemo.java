package chap06;

class Box{
	public Box(){
		System.out.println("오랜지");
	}
	
}
class ColoredBox extends Box{
	public ColoredBox() {
		System.out.println("사과");
	}
}
public class BoxDemo {

	public static void main(String[] args) {
		//부모 생정자 먼저 실행
		ColoredBox cb = new ColoredBox();

	}

}
