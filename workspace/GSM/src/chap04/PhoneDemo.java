package chap04;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone iphon = new Phone();
		Phone Galex = new Phone();
		
		Galex.model = "갤럭시 s8";
		Galex.value = 100;
		iphon.model = "아이폰 10";
		iphon.value = 200;
		
		Galex.print();
		iphon.print();

	}

}

