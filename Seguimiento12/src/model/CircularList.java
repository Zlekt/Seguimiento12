package model;

public class CircularList {

	private CircularNode first;
	private CircularNode last;
	private CircularNode current;
	
	public CircularList() {
		
	}
	
	public void add() {
		
		if(first==null) {
			
			CircularNode newNode = new CircularNode(1);
			newNode.setNext(newNode);
			newNode.setPrevious(newNode);
			first = newNode;
			last = newNode;
			current = newNode;
			
		}
		else {
			CircularNode newNode = new CircularNode(last.getValue()+1);
			if(newNode.getValue()>=50) {
				
			}
			else {				
				newNode.setNext(first);
				newNode.setPrevious(last);
				first.setPrevious(newNode);
				last.setNext(newNode);
				last = newNode;
			}
		}
		
	}
	
	
	public void passTurn(boolean att) {
	if(att) {
		if(current==first) {
			
			current.getPrevious().setNext(current.getNext());
			current.getNext().setPrevious(current.getPrevious());
			current = current.getNext();
			first = current;
		}else if(current==last) {
			current.getPrevious().setNext(current.getNext());
			current.getNext().setPrevious(current.getPrevious());
			current = current.getNext();
			last = current;
		}else if(current==last&&current==first) {
			current.getPrevious().setNext(current.getNext());
			current.getNext().setPrevious(current.getPrevious());
			current = current.getNext();
			last = current;
			first = current;
		}
		else {
			current.getPrevious().setNext(current.getNext());
			current.getNext().setPrevious(current.getPrevious());
			current = current.getNext();
		}
		
	}
	else if(att==false) {
		
		if(current.getTurns()<=3) {
			
			current.passTurn();
			if(current.getTurns()>=3) {
				if(current==first) {
					
					current.getPrevious().setNext(current.getNext());
					current.getNext().setPrevious(current.getPrevious());
					current = current.getNext();
					first = current;
				}else if(current==last) {
					current.getPrevious().setNext(current.getNext());
					current.getNext().setPrevious(current.getPrevious());
					current = current.getNext();
					last = current;
				}else if(current==last&&current==first) {
					current.getPrevious().setNext(current.getNext());
					current.getNext().setPrevious(current.getPrevious());
					current = current.getNext();
					last = current;
					first = current;
				}
				else {
					current.getPrevious().setNext(current.getNext());
					current.getNext().setPrevious(current.getPrevious());
					current = current.getNext();
				}
				
			}
			else {
				current.passTurn();
				current = current.getNext();
			}
		}
	}
	}
	public String printCurrent() {
		if(current==null) {
			return "";
		}
		else {			
			return current.toString();
		}
	}
	public String toString() { //Utilizado para pruebas
		CircularNode temp = first;
		String message = "";
		do {
			message+= temp.toString();
			temp = temp.getNext();
		}while(temp!=last);
		return message;
	}
	
}
