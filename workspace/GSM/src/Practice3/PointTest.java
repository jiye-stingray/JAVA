package Practice3;
class Point{
	private int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(x,y) :" + "("+x+","+y+")";
	}
}
class MovablePoint extends Point{

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	private int xSpeed , ySpeed;

	@Override
	public String toString() {
		
		return super.toString() + " ���ǵ� x: "+xSpeed+" ���ǵ� y: "+ySpeed;
	}
	
	
}
public class PointTest {

	public static void main(String[] args) {
		Point p = new Point(2,3);
		MovablePoint mp = new MovablePoint(2,3,4,5);
		System.out.println(p.toString());
		System.out.println(mp.toString());

	}

}