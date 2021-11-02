package chap07;

interface Controllable {
    void turnOn();
    void turnOff();
    
    default void repair(){
        System.out.println("장비를 수리한다");
    }
    static void reset(){
        System.out.println("장비 초기화");
    }
}


class TV implements Controllable{
	@Override
	public void repair() {
    Controllable.super.repair();
	}

	@Override
	public void turnOn(){
		System.out.println("TV를 켠다.");
	}

	@Override
	public void turnOff(){
		System.out.println("TV를 끈다.");
	}

}

 class Computer implements Controllable{
    @Override
    public void repair() {
        Controllable.super.repair();
    }

    @Override
    public void turnOn() {
        System.out.println("컴퓨터를 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터를 끈다.");
    }
//    @Override
//	public void repair() {
//		Controllable.super.repair();
//	}
    
 }
    


public class ControllableDemo {
	public static void main(String[] args) {
		Controllable[] controllable= {new TV(),new Computer()};
		
		for(Controllable c:controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
		}
		Controllable.reset();
	}
}