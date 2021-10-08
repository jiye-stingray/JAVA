package chap06;

class Cone extends Circle111{

	public Cone(int r, int h) {
		super(r,h);
	}
	
	@Override
	public void findArea() {
		System.out.println(Math.round(3.14*r*Math.sqrt((r*r)+(h*h))+(3.14*r*r)));
	}
}