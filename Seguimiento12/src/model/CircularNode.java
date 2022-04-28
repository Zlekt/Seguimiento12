package model;

public class CircularNode {

	private int value;
	private CircularNode previous;
	private CircularNode next;
	private int turns;
	
	public CircularNode(int value) {
		
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public CircularNode getPrevious() {
		return previous;
	}

	public void setPrevious(CircularNode previous) {
		this.previous = previous;
	}

	public CircularNode getNext() {
		return next;
	}

	public void setNext(CircularNode next) {
		this.next = next;
	}
	
	public void deleteNode(int item) {
		
		if(next.getValue()==item) {
			
			next = next.getNext();
			
		}
	}
	public void passTurn() {
		turns++;
	}
	
	public int getTurns() {
		
		return turns;
	}
	public String toString() {
		return Integer.toString(value);
	}
	
}
