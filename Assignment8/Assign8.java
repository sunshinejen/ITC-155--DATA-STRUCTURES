
public class Assign8 {

	public static void main(String[] args) {
		
		int [] data = {11, -7, 3, 42, 3, 0, 14, 3};
		ArrayIntList list = new ArrayIntList();
		
		for (int n :data) {
			list.add(n);
		}
	System.out.println("List: " + list ); //prints out list
		System.out.println();
	//Now we replace 3's with 999 in the list
	list.replaceAll(3,999);
	//list.replaceAll(11, 999);
	//list.replaceAll(42, 999);
	System.out.println("New List: " + list);

	}
	

}
