import java.util.Arrays;
//The modified version of the selection sort algorithm is not faster
//The complexity class is 0(N^2)
public class Assign7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {2, 5, -2, 4, 42, 3};
		int[] num2 = {10, 34,2,56, 7, 67, 88, 42};
		
		selectionSort1(numbers); 
		selectionSort1(num2); 
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(num2));

		}


	public static void selectionSort1(int [] a) {
		for (int i = 0; i <a.length -1; i++ ) {
		int largest = i ;
		for (int j = i + 1; j < a.length; j++) {
			if (a[j] > a[largest]) {
				largest = j;
			}
	
		}
		swap(a, i,largest); //swap the largest to the front
	}

	}
	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		if (i != j ) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
	
}
