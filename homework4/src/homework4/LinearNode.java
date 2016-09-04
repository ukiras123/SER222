package homework4;

public class LinearNode<T> {
	
	/**
	 *  reference to next node in list 
	 */
	private LinearNode<T> next;
	private LinearNode<T> last;
	
	/**
	 *  element stored at this node
	 */
	 private T element;
	
	 /**
	 *  Create empty node
	 */
	 public LinearNode() {
		 next = null;
		 last = null;
		 element = null;
	 }
	 
	 /**
	  * Create a node with element
	  */
	 
	 public LinearNode(T elem) {
		 next = null;
		 last = null;
		 element = elem;
	 }
	 
	
	 /** 
	  * Set the next node
	  */
	 public void setNext(LinearNode<T> node) {
		 next = node;
	 }
	 
	 /**
	  * Return the next node
	  */
	 public LinearNode<T> getNext() {
		 
		 return next;
	 }
	 
	 /** 
	  * Set the last node
	  */
	 public void setLast(LinearNode<T> node) {
		 last = node;
	 }
	 
	 /**
	  * Return the last node
	  */
	 public LinearNode<T> getLast() {
		 
		 return last;
	 }
	 
	
	 
	 /**
	  * Set the element
	  */
	 public void setElement(T elem) {
		 element = elem;
	 }
	 
	 /**
	  * Get the element
	  */
	 public T getElement() {
		 return element;
	 }
	 
	
	  
	  
}
