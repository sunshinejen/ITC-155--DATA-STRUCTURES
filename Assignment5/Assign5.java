
public class Assign5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeNums(12);
		System.out.println();

		writeNums(6);
		System.out.println();

		writeNums(2);
		System.out.println();

		writeNums(0);
		System.out.println();

	}

	public static void writeNums(int n) {
		//
		if (n < 1) {
			throw new IllegalArgumentException();
		} 
		
		if (n == 1) {// base case
			System.out.print(n);
		} else {//recursive case
			writeNums(n - 1);
			System.out.print(", " + n);

		}

	}

}
