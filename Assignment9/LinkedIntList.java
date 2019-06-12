
public class LinkedIntList {
	
	public IntTreeNode firstValue;
	
	public LinkedIntList() {
		firstValue = null;
	}
	
	
	//create a string representation of the list
	public String toString() {
			if(firstValue == null) {
				return "[]";
			} else {
				String result = "[" + firstValue.data;
				IntTreeNode current = firstValue.next;
				while(current != null) {
					result += ", " + current.data;
					current = current.next;
				}
				result += "]";
				return result;
				}
			}	
	public void add (int value) {
		if (firstValue == null) {
			firstValue = new IntTreeNode (value);
		} else {
			IntTreeNode current = firstValue;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new IntTreeNode(value);
		}
	}
	
	//An empty list is considered to be sorted
	public boolean isSorted() {
		if(firstValue == null) {
			return true; 
		} else {
			IntTreeNode previous = firstValue;
			IntTreeNode current = firstValue.next;
			while(current != null) {
				if(previous.data <= current.data) {
					previous = current;
					current = current.next;
				} else {
					return false;
				}
			}
			return true;
		}
	}
}
