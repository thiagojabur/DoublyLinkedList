import java.util.*;
public class Stack {
	protected DoublyNode head;
    protected DoublyNode tail; 
	int size=0;
	
	public String toString(){
		//for da cabeça até o último nó
		if (size ==0) {
			return "";
		}
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
	public Stack() {
		super();
	}
	public Stack(DoublyNode head, DoublyNode tail) {
		this.head = head;
		this.tail = tail;
	}

	void push(DoublyNode newNode) {
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
	

	public DoublyNode pop() 
   {
		if (size == 0 ) {
		   return new DoublyNode(0);
		   //to-do criar a exceção
		}
		
		DoublyNode retorno;
		retorno = tail;
		tail = tail.getPrev();
		tail.setNext(null);
		
		size--;
		if (size ==0) {
			head = null;
			tail = null;
		}			
		
		return retorno;
		
	}
	
	private DoublyNode top() {
		return tail;
	}
	private void setHead(DoublyNode head) {
		this.head = head;
	}

	private void setTail(DoublyNode tail) {
		this.tail = tail;
	}	
}
