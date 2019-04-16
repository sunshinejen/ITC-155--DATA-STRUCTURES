import java.util.*;

//Write a Method called removeEvenLength that takes an ArrayList of strings as a parameter
//and removes all of the strings of even length from the list
public class RemoveEvenLength {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("a");
		words.add("be");
		words.add("bye");
		words.add("how");
		words.add("is");
		words.add("it");
		words.add("or");
		words.add("that");
		words.add("the");
		words.add("this");
		words.add("to");
		words.add("why");

		
		System.out.println("Full Word List: " + words);//prints full array List
		for (int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			if (word.length() % 2 == 0) {
				words.remove(word);
				i--;
				
			}
		}
		System.out.println("New Word List: "+ words);//prints new array list with only odd strings
	}
	

}
