package homework4;
/**
 * This program provides an implementation of the Deque interface
 * and demonstrates it.
 * 
 * @author (your name), Acuna
 * @version (version)
 */
import java.util.NoSuchElementException;
    
//TODO: implement.
public class BaseDeque<Item> implements Deque<Item> {

	private int count = 0;
	private LinearNode<Item> front;
	private LinearNode<Item> rear;
    /**
     * Program entry point for deque. 
     * @param args command line arguments
     */    
    public static void main(String[] args) {
        BaseDeque<Integer> deque = new BaseDeque<>();

        //standard queue behavior
        deque.enqueueBack(3);
        deque.enqueueBack(7);
        deque.enqueueBack(4);
        deque.dequeueFront();        
        deque.enqueueBack(9);
        deque.enqueueBack(8);
        deque.dequeueFront();
        System.out.println("size: " + deque.size());
        System.out.println("contents:\n" + deque.toString());   

        //deque features
        System.out.println(deque.dequeueFront());        
        deque.enqueueFront(1);
        deque.enqueueFront(11);                         
        deque.enqueueFront(3);                 
        deque.enqueueFront(5);
        System.out.println(deque.dequeueBack());
        System.out.println(deque.dequeueBack());        
        System.out.println(deque.last());                
        deque.dequeueFront();
        deque.dequeueFront();  
        System.out.println(deque.first());        
        System.out.println("size: " + deque.size());
        System.out.println("contents:\n" + deque.toString());            
    }

    public BaseDeque() {
    	count = 0;
        front = new LinearNode<>();
        rear  = new LinearNode<>();
      
    }
    
	
	public void enqueueFront(Item element) {
		
		if (isEmpty()) {
	        front.setElement(element);
	        rear.setElement(element);
	        rear.setLast(front);
		} else {
			
			LinearNode<Item> node = new LinearNode<>(element);
			
			if(size() == 1) {
				rear.setLast(node);
			}
			
			node.setNext(front);
			front.setLast(node);
			front = node;
	        
		}
		
		count++;
	}

	
	public void enqueueBack(Item element) {
		
		
		if (isEmpty()) {
	        front.setElement(element);
	        rear.setElement(element);
	        front.setNext(rear);
	        
		} else {
			
			LinearNode<Item> node = new LinearNode<>(element);
			
			if(size() == 1) {
				front.setNext(node);
			}
			
			node.setLast(rear);
			rear.setNext(node);
			
	        rear = node;
		}
		
		count++;
	}

	
	public Item dequeueFront() throws NoSuchElementException {
		
		if(isEmpty()){
		     throw new NoSuchElementException();
		}
		
		LinearNode<Item> lastFront = front;
		front = front.getNext();
		front.setLast(null);
		count--;
		return lastFront.getElement();
	}


	public Item dequeueBack() throws NoSuchElementException {
		
		if(isEmpty()){
		     throw new NoSuchElementException();
		}
		
		LinearNode<Item> lastRear = rear;
		rear = rear.getLast();
		rear.setNext(null);
		count--;
		return lastRear.getElement();
	
	}
	
	public Item first() throws NoSuchElementException {
		
		if(isEmpty()){
		     throw new NoSuchElementException();
		}

		return front.getElement();
	}
	
	public Item last() throws NoSuchElementException {
		
		if(isEmpty()){
		     throw new NoSuchElementException();
		}
		
		return rear.getElement();
	}

	public boolean isEmpty() {
		
		if(size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		
		return count;
	}
	
	@Override
    public String toString() {
		
		String str = new String();
		LinearNode<Item> lastNode = rear;

		while(lastNode != null) {			
			str += lastNode.getElement().toString();
			lastNode = lastNode.getLast();
			if(lastNode != null) {
				str += " ";
			}
		}
		return str;
	}
} 