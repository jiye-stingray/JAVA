package Practice;
class Complex{
	static double n = 0.0;
	static double c = 0.0;
	
	public Complex(double n) {
		this.n = n;
		
	}

	public Complex(double n, double c) {
		this.n= n;
		this.c= c;
	}

	static void print() {
		System.out.println(n + " + "+c+"i");
	}
}

public class ComplexTest {

	public static void main(String[] args) {
		Complex c1 = new Complex(2.0);
		c1.print();
		Complex c2 = new Complex(1.5,2.5);
		c1.print();
		

	}

}
