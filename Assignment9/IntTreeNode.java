
public class IntTreeNode {
	
	public int data;
	public IntTreeNode next;
	
	//constructor, construct a leaf node with given data
	public IntTreeNode() {
		this(0, null);
	}
	
	public IntTreeNode(int data) {
		this (data,null);
	}
	//constructs a branch node with data and next subtree
	public IntTreeNode(int data, IntTreeNode next) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = next;
	}
	

}
