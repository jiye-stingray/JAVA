package chap06;

class Circle111{
	int r;
	int h;
	
	public Circle111(int r) {
		this.r = r;
	}

	public Circle111(int r, int h) {
		this.r = r;
		this.h = h;
	}

	void findArea() {
		System.out.println(Math.round(r*r*3.14));
	}
	
}