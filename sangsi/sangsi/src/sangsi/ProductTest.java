package sangsi;
class Product{
	public Product(int code) {
		this.code = code;
	}
	int code;
	int count = 5;
	
	void Add() {
		count++;
	}
	void sub() {
		count--;
	}
	void show() {
		System.out.println("현재 재고는 "+count+"입니다");
	}
}

public class ProductTest {

	public static void main(String[] args) {
		Product p = new Product(1234);
		p.show();
		p.Add();
		p.show();
		p.sub();
		p.show();

	}

}
