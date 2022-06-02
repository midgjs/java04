
public class Ex03 {

	public static void main(String[] args) {
		int sum=0;
		int totalsum=0;
		for(int i=1; i<=10; i++) {
			sum = sum+i;
			totalsum = totalsum + sum;
		}
		System.out.println("totalsum = " + totalsum);
	}

}
