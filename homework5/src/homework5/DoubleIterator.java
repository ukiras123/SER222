package homework5;

import java.util.Iterator;

public class DoubleIterator<T> implements Iterator<T> {

	private DoubleList<T> doubleList;
	
	public DoubleIterator() {
		doubleList = null;
	}
	
	public DoubleIterator(DoubleList<T> list) {
		setDoubleList(list);
	}
	
	public void setDoubleList(DoubleList<T> list) {
		doubleList = list;
	}
	
	
	@Override
	public boolean hasNext() {
		
	
		return false;
	}

	@Override
	public T next() {
		
		return null;
	}

}
