package Practice;

import java.util.Scanner;

class Rectangle{
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}

public class RectApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		r.width = sc.nextInt();
		r.height = sc.nextInt();
		System.out.println("�簢���� ������ "+ r.getArea()); 

	}

}
