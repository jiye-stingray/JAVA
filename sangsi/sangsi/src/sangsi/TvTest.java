package sangsi;

class Tv{
	String name;
	int year;
	int size;

	public Tv(String name, int year, int size) {
		this.name = name;
		this.year = year;
		this.size = size;
	}
	
	void show() {
		System.out.println(name + "에서 만든 "+year + "년형 "+ size+"인치 Tv");
	}
	
}

public class TvTest {

	public static void main(String[] args) {
		Tv myTv = new Tv("LG",2021,70);
		myTv.show();
	}

}
