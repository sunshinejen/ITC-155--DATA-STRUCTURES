//4th Ed of textbook Ch 16… 
//p. 1012 ex. 3 Write a method called isSorted


public class Assign9 {

	public static void main(String[] args) {
		LinkedIntList list  = new LinkedIntList();
		list.add(1);
		list.add(2);
		list.add(14);
		list.add(6);
		list.add(4);
		list.add(20);
		list.add(-8);
		
		LinkedIntList list2  = new LinkedIntList();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(20);
		list2.add(100);
		
		
		String result = list.toString();
		System.out.println(result);
		
		System.out.println(list.isSorted());// returns false
		
		System.out.println();
		
		String result2 = list2.toString();
		System.out.println(result2);
		
		System.out.println(list2.isSorted());// returns true


	}
	
	
	

}
