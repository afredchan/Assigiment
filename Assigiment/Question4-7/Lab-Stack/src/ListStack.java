/**
 * Title:         ListStack.java
 * Description:   A Stack class extended from LinkedList class
 * Company:       ICT HKIVE(TY)
 * @author        Patrick Tong
 */

import java.util.EmptyStackException;

public class ListStack extends LinkedList {

    public ListStack() {    // <== constructor, different from ListStackComp.java
		super();
    }

	public boolean empty() {
	   return isEmpty();
	}

	public void push(Object item) {
		addToHead(item);
	}

	public Object pop() {
		return removeFromHead();
	}

	public Object peek() {
		return head.getData();
	}

	public int search(Object item) {
       
		int i =1 ;
		for(;i<=length ; i++) {
			if(item.equals(get(i))) {
				return i;
			}
		}
		return -1 ;
	}
}