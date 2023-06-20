
public class Queue {
	protected DoublyNode head;
    protected DoublyNode tail; 
	int size=0;
	
	public String toString(){
		//for da cabeça até o último nó
		if (size ==0)
			return "Fila vazia";
		
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
	public Queue() {
		super();
	}
	public Queue(DoublyNode head, DoublyNode tail) {
		this.head = head;
		this.tail = tail;
	}
	
	void enQueue(DoublyNode newNode) {
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
	public DoublyNode front() {
		return head;
	}
	
	public DoublyNode deQueue() {
		DoublyNode elemento = head;
		size--;
		if (size != 0 ) {
			head = head.getNext();
			elemento.setNext(null);
			head.setPrev(null);
		} else {
			head = null;
			tail = null;
		}	
		return elemento;
	}
	public DoublyNode getTail() {
		return tail;
	}
	public void setTail(DoublyNode tail) {
		this.tail = tail;
	}	
}
