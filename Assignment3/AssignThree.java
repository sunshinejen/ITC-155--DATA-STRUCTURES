import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AssignThree {

	public static void main(String[] args) {
		//create list 
		int[]  list = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15};

		System.out.println(Arrays.toString(list));//prints Array list 
		// 
		System.out.println(countUnique(list));
		
 
	}

	private static int countUnique(int [] list) {
		//
		Set<Integer> list2 = new HashSet<Integer>();
		
		for (int num : list ) {
			list2.add(num);
		}
		if(list2.size() == 1) {
			return 0;
		}
		 return list2.size();
		}
	}
