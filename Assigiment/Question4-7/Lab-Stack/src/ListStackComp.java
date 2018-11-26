/**
 * Title:         ListStack.java
 * Description:   A Stack class by composition using LinkedList object
 * Company:       ICT HKIVE(TY)
 * @author        Patrick Tong
 */

import java.util.EmptyStackException;

public class ListStackComp  {

	private LinkedList list;	// compose with a LinkedList object

    public ListStackComp() {   // <== constructor, different from ListStack.java
		list = new LinkedList();
    }

	public boolean empty() {
		return list.isEmpty();
	}

	public void push(Object item) {
		list.addToHead(item);
	}

	public Object pop() {
		return list.removeFromHead();
	}

	public Object peek() {
		return list.head.getData();
	}

	public int search(Object item) {

		int i =1;
		for(;i<=list.length ; i++) {
			if(item.equals(list.get(i))) {
				return i;
			}
		}
		return -1 ;
	}

	// Provide also the toString() method (for TestStack.java)
	public String toString() {
		return list.toString() ;
	}

}