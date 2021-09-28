package Practice2;
//p.249, 3번

public class MovablePoint extends Point{
	private int xSpeed;
	private int ySpeed;
	

	public int getxSpeed() {
		return xSpeed;
	}


	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}


	public int getySpeed() {
		return ySpeed;
	}


	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}


	public MovablePoint(int x, int y,int xSpeed,int ySpeed) {
		super(x, y);
		setxSpeed(xSpeed);
		setySpeed(ySpeed);
		
	}
	
	public String toString() {
		return "x의 값은 "+ getX() + ", x의 스피드는 "+getxSpeed() + ","+
				"y의 값은 " + getY() + ", y의 스피드는 "+getySpeed();
	}

}
