package sangsi;



public class NumOfCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {1,9,3,2,4,3,2,9,1,5};
		
		
		for(int i = 0; i< 10; i++){
			System.out.printf("%d: ",i);
			
			for(int n: num) {
				if(i == n) {
					System.out.printf("%s ",'*');
				}
			}
			System.out.println();
		}
	}
	
	
}

