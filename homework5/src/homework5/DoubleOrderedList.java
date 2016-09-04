package homework5;

public class DoubleOrderedList<T> extends DoubleList<T> implements OrderedListADT<T>{

	
	public DoubleOrderedList() {
		super();
	}
	
	public void add(T element) {
		DoubleNode<T> newNode = new DoubleNode<T>(element);
		
		
		if(head == null) {
			head = newNode;
		} else {
			head.setNext(newNode);
			newNode.setPrevious(head);
			head = newNode;
		}
		System.out.println("add: " + head.getElement());
		count ++;
	}

}
