package homework5;

import java.util.Iterator;

public class DoubleList<T> implements ListADT<T>, Iterable<T> {

	protected int count = 0;
	protected DoubleNode<T> head;
	
	public DoubleList() {
		
		count = 0;
		head  = null;
		
	}
	
	public T removeFirst() {
		
		DoubleNode<T> tempNode = head;
		for(int i = 0; i < count; i ++) {
			
				tempNode = tempNode.getPrevious();
				
		}
		
		DoubleNode<T> firstNode = tempNode;
		firstNode.getNext().setPrevious(null);
		count--;
		return firstNode.getElement();
		
	}
	
	public T removeLast() {
		
		DoubleNode<T> lastNode = head;
		DoubleNode<T> newHead = head.getPrevious();
		head = newHead;
		head.setNext(null);
		count--;
		return lastNode.getElement();
	
	}
	
	public T removeTarget(T targetElement) {
		return null;
	}
	
	public T first() {
		return head.getElement();
	}
	
	public T last() {
		
		DoubleNode<T> tempNode = head;
		for(int i = 0; i < count; i ++) {
			tempNode = tempNode.getNext(); 
		}
		
		DoubleNode<T> lastNode = tempNode;
		return lastNode.getElement();
	}
	
	
	public boolean contains(T target) {
		
		DoubleNode<T> tempNode = head;
		for(int i = 0; i < count; i ++) {
			
			if(target == tempNode.getElement() ) {
				return true;
			}
			
			tempNode = tempNode.getNext(); 
		}
		
		return false;
		
	
	}
	
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return count;
	}
	

	public String toString() {
		
		
		String str = new String();
		DoubleNode<T> tempNode = head;
		for(int i = 0; i < count; i ++) {
			
				str += tempNode.getElement().toString() + " ";
				tempNode = tempNode.getPrevious();
			
		}
		
		return str;
	}

	@Override
	public Iterator<T> iterator() {

		return null;
	}

	@Override
	public T remove(T element) {
		
		DoubleNode<T> targetNode = head;
		for(int i = 0; i < count; i ++) {
			
				if(element == targetNode.getElement() ) {
					
					DoubleNode<T> previousNode = targetNode.getPrevious();
					DoubleNode<T> nextNode = targetNode.getNext();
					
					if(nextNode != null) {
						nextNode.setPrevious(previousNode);
					}
					if(previousNode != null) {
						previousNode.setNext(nextNode);
					}
					
					count--;
					return targetNode.getElement();
				}
				
				targetNode = targetNode.getPrevious();
			
		}
		
		return null;
	}
	
	
}
