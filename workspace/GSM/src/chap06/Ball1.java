package chap06;

class Ball1 extends Circle111{

	public Ball1(int r, int h) {
		super(r,h);
	}
	

	@Override
	public void findArea() {
		System.out.println(Math.round(4*3.14*r*r));
	}
	
}
