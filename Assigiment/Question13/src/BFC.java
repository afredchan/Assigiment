import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFC {
	private int n;
	private LinkedList<Integer> List[];
	private Queue<Integer> queue = new LinkedList();
	
	public void graph(int number) {
		n = number;
		List = new LinkedList[number];
		
		for (int i= 0; i < number; i++) {
			List[i] = new LinkedList();
		}
	}
	
	public void addToBFC(int a, int v) {
		List[a].add(v);
	}
	
	public void searchToBFC(int v) {
		boolean visited[] = new boolean[n];
		traversal(v, visited);
		for ( int i = 0; i < n; i++ ) {   
			if( visited[i] != true ) {
				traversal(i, visited);
			}
		}
	}
	
	public void traversal(int v, boolean[] visited) {
		queue.add(v);
		visited[v] = true;
		
		while( !queue.isEmpty() ) {   
			int k = queue.remove();
		    System.out.print( k +" ");
			Iterator<Integer> i = List[k].listIterator();
			int j;
			
			while( i.hasNext() ) {
        		j = i.next();
				if( visited[j] != true ) {
				queue.add(j);
				visited[j] = true;
				}
			}
		}
	}


}
