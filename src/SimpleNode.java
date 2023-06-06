
public class SimpleNode {
	int value;
	SimpleNode next;
	
	
	public String toString() {
		return value + "";
	}
	public SimpleNode(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public SimpleNode getNext() {
		return next;
	}
	public void setNext(SimpleNode next) {
		this.next = next;
	}
	

}
