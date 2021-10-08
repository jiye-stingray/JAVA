package chap06;

class Cylinder1 extends Circle111{

	public Cylinder1(int r, int h) {
		super(r,h);
	}
	
	@Override
	public void findArea() {
		System.out.println(Math.round((2*3.14*r*r)+(2*3.14*r*h)));
	}
	
}