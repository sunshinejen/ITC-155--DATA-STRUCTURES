
public class ArrayIntList {

	private int [] elementData;
	private int size;
	
	public static final int DEFAULT_CAPACITY = 100;
	
	public ArrayIntList() {
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayIntList(int capacity) {
		if(capacity < 0 ) {
			throw new IllegalArgumentException("Capacity: " + capacity);
			
		}
		elementData = new int[capacity];
		size = 0;
	}

	public void add(int value) {
		elementData[size] = value;
		size++;
		
	}

	//replaces all occurrences of the value in the list with the second value
	public void replaceAll(int value, int value2) {
		for(int i = 0; i < size; i++) {
			if(elementData[i] == value)
				elementData[i] = value2;
		}
		
	}
	
	//create a string representation of the list
	public String toString() {
		if(size == 0) {
			return "[]";
		} else {
				String result = "[" + elementData[0];
		for(int i = 1; i < size; i++) {
			result += ", " + elementData[i];
				}
				result += "]";
				return result;
				}
			}

}
