package Practice2;
//p.249, 3��

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
		return "x�� ���� "+ getX() + ", x�� ���ǵ�� "+getxSpeed() + ","+
				"y�� ���� " + getY() + ", y�� ���ǵ�� "+getySpeed();
	}

}
