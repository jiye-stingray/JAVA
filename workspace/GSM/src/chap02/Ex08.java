package chap02;

public class Ex08 {
	
	public static int Sum(int n1,int n2){
		int s = 0;
		for(int i = n1;i<=n2;i++) {
			s+=i;
		}
		return s;
	}
	public static double Sum(double n1,double n2){
		double s = 0;
		for(double i = n1;i<=n2;i++) {
			s+=i;
		}
		return s;
	}
	
	public static double Sum(double nd1, int n1){
		double s = 0;
		for(double i = nd1; i<=n1; i+=0.5) {
			s+=i;
		}
		return s;
	}
	
	public static void main(String[] args) {
		int n1=10,n2=100;
		double nd1=5.5, nd2 = 10.5;
		int s = Sum(n1,n2);
		double s1= Sum(nd1,nd2);
		double s2 = Sum(nd1,n1);
		System.out.printf("%d,%.2f,%.2f	",s,s1,s2);
	}

}
