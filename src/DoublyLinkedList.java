
public class DoublyLinkedList {
	protected DoublyNode head;
    protected DoublyNode tail; 
	int size=0;
	
	public String toString(){
		//for da cabeça até o último nó
		DoublyNode elemento = head;
		
		String returnString = "";
		do {
			returnString += elemento.getValue() + ""; 
							
			returnString += " ";
			elemento = elemento.getNext();
		} while (elemento != null);
		
		return returnString;
	}
	public int getSize() {
		return size;
	}
	public DoublyLinkedList() {
		super();
	}
	public DoublyLinkedList(DoublyNode head, DoublyNode tail) {
		this.head = head;
		this.tail = tail;
	}
	void addFirst(DoublyNode newNode) {
		if (size == 0) {
			tail = newNode;
			head = newNode;
		} else {
			newNode.setNext(head);
			head.setPrev(newNode);
		}
		head = newNode;
		size++; 
	}
	void addLast(DoublyNode newNode) {
		if (size ==0) {
			head = newNode;
			tail = newNode;
		}	
		else 
			tail.setNext(newNode);
		newNode.setPrev(tail);
		tail = newNode;
		size++;	
	}
	void addAfter(DoublyNode newNode, DoublyNode n) {

		if (size == 1 || n == tail)
			tail = newNode;
		else
			n.getNext().setPrev(newNode);
		
		newNode.setNext(n.getNext());
		n.setNext(newNode);
		newNode.setPrev(n);
		size++;
		if (n == tail) 
			tail = newNode;
	}
	

	void addBefore(DoublyNode newNode, DoublyNode n) {
		
		if (size == 1)
			head = newNode;
		
		newNode.setNext(n);
		if (n == head) 
			head = newNode;
		else 
		{	
			newNode.setPrev(n.getPrev());
			n.getPrev().setNext(newNode);
			n.setPrev(newNode);
			newNode.setNext(n);
		}	
		
		size++;
		
		if (n == tail) 
			tail = newNode;
	}
	
	public DoublyNode getHead() {
		return head;
	}
	
	public void removeFirst() {
		DoublyNode elemento = head;
		head = head.getNext();
		elemento.setNext(null);
		head.setPrev(null);
		size--;
	}
	public void removeLast() {
		tail = tail.getPrev();
		tail.setNext(null);
		size--;
	}
	
	public void setHead(DoublyNode head) {
		this.head = head;
	}
	public DoublyNode getTail() {
		return tail;
	}
	public void setTail(DoublyNode tail) {
		this.tail = tail;
	}	
}
