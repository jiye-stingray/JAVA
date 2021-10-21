package chap07;
interface Wearable{
	void PutOn();
	void PutOut();
}
interface Skinnable{
	int BLACK = 0;
	int RED = 1;
	int GREEN = 2;
	int GRAY = 3;
	int YELLOW = 4;
	
	void changeSkin(int skin);
}
class HeadMountedDisplay implements Wearable, Skinnable{

	private int skin;
	@Override
	public void PutOn() {
		System.out.println("디스플레이를 사용합니다");
		
	}

	@Override
	public void PutOut() {
		System.out.println("디스플레이를 벗었습니다");
		
	}
	//스킨 변경
	public void changeSkin(int skin) {
		this.skin = skin;
	}
	
	public void putSkin() {
		switch(skin) {
		case BLACK:
			System.out.println("BLACK DISPLAY"); break;
		case RED:
			System.out.println("RED DISPLAY"); break;
		case GREEN:
			System.out.println("GREEN DISPLAY"); break;
		case GRAY:
			System.out.println("GRAY DISPLAY"); break;
		case YELLOW:
			System.out.println("YELLOW DISPLAY"); break;
		
		}

	}
	
}

public class WearableDemo {

	public static void main(String[] args) {
		HeadMountedDisplay hmd = new HeadMountedDisplay();
		hmd.PutOn();
		hmd.PutOut();
		hmd.changeSkin(Skinnable.YELLOW);
		hmd.putSkin();
		
		
		Wearable w = hmd;
		w.PutOn();
		w.PutOut();
		
		Skinnable s = hmd;
		s.changeSkin(Skinnable.BLACK);
		
		hmd.putSkin();
		
		

	}

}
