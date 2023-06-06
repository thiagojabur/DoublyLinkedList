
public class SimpleLinkedList {
	protected SimpleNode head;
    protected SimpleNode tail; 
	int size=0;
	
	
	
	public String toString(){
		//for da cabeça até o último nó
		SimpleNode elemento = head;
		
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
	public SimpleLinkedList() {
		super();
	}
	public SimpleLinkedList(SimpleNode head, SimpleNode tail) {
		this.head = head;
		this.tail = tail;
	}
	void addFirst(SimpleNode newNode) {
		if (size == 0) 
			tail = newNode;
		newNode.setNext(head);
		head = newNode;
		size++; 
	}
	void addLast(SimpleNode newNode) {
		if (size ==0) 
			head = newNode;
		else 
			tail.setNext(newNode);
		tail = newNode;
		size++;	
	}
	void addAfter(SimpleNode newNode, SimpleNode n) {
		//inserir após o n
		if (size == 1)
			tail = newNode;
		n.setNext(newNode);
		size++;
		if (n == tail) 
			tail = newNode;
	}
	
	SimpleNode getPreviousNode(SimpleNode n) {
		//achando o anterior do n
		SimpleNode nodeAnterior = head;
		while(nodeAnterior .getNext()!=n ) {
			nodeAnterior = nodeAnterior.getNext();
		}
		return nodeAnterior;
	}
	void addBefore(SimpleNode newNode, SimpleNode n) {
		//inserir após o n
		if (size == 1)
			head = newNode;
		
		newNode.setNext(n);
		if (n == head) 
			head = newNode;
		else 
		{	
			SimpleNode noAnterior = getPreviousNode(n);
			noAnterior.setNext(newNode);
		}	
		
		size++;
		
		if (n == tail) 
			tail = newNode;
	}
	
	public SimpleNode getHead() {
		return head;
	}
	
	public void removeFirst() {
		SimpleNode elemento = head;
		head = head.getNext();
		elemento.setNext(null);
		size--;
	}
	public void removeLast() {
		SimpleNode anterior = getPreviousNode(tail);
		tail = anterior;
		anterior.setNext(null);
		size--;
	}
	
	public void setHead(SimpleNode head) {
		this.head = head;
	}
	public SimpleNode getTail() {
		return tail;
	}
	public void setTail(SimpleNode tail) {
		this.tail = tail;
	}
	
	
}
