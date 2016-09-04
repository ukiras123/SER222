package homework5;

public class DoubleNode<T> {

	// reference to next node in list 
		private DoubleNode<T> next;

		// reference to last node in list 	
		private DoubleNode<T> prev;
		
		// element stored at this node
		 private T element;
		
		 
		 /**
		 *  Create empty node
		 */
		 public DoubleNode() {
			 next = null;
			 prev = null;
			 element = null;
		 }
		 
		 /**
		  * Create a node with element
		  */
		 public DoubleNode(T elem) {
			 next = null;
			 prev = null;
			 element = elem;
		 }
		 
		
		 /** 
		  * Set the next node
		  * @param the next node
		  */
		 public void setNext(DoubleNode<T> node) {
			 next = node;
		 }
		 
		 /**
		  * Return the next node
		  * @return the next node
		  */
		 public DoubleNode<T> getNext() {
			 
			 return next;
		 }
		 
		 /** 
		  * Set the last node
		  * @param the last node
		  */
		 public void setPrevious(DoubleNode<T> node) {
			 prev = node;
		 }
		 
		 /**
		  * Return the last node
		  * @return the last node
		  */
		 public DoubleNode<T> getPrevious() {
			 
			 return prev;
		 }
		 
		
		 
		 /**
		  * Set the element
		  * @param the element of this node
		  */
		 public void setElement(T elem) {
			 element = elem;
		 }
		 
		 /**
		  * Get the element
		  * @return the element of thid node
		  */
		 public T getElement() {
			 return element;
		 }
		 
		 

}
