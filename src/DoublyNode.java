
public class DoublyNode {
	int value;
	DoublyNode next, prev;
	
	public DoublyNode getPrev() {
		return prev;
	}
	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}
	@Override
	public String toString() {
		return value + "";
	}
	public DoublyNode(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public DoublyNode getNext() {
		return next;
	}
	public void setNext(DoublyNode next) {
		this.next = next;
	}
	

}
