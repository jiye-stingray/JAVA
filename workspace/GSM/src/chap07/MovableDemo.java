package chap07;

interface Movable {
    void move(int x);
}

class Car implements Movable {
	private int pos=0;
	
    public void move(int x) { //�߻�޼���
        pos+=x;
    }

    public void show(){
    	System.out.println(pos+"m �̵��߽��ϴ�");
    }

	
}

public class MovableDemo {
    public static void main(String[] args) {
        Movable m = new Car();
        
        m.move(10);
//        m.show(); 

        Car c = (Car) m;
        c.move(5);
        c.show();
    }
}