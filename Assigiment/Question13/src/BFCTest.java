import java.util.*;
import java.util.Queue;
 
public class BFCTest {

	public static void main(String args[]) {
		BFC bsc = new BFC();
		
		bsc.graph(10);
		bsc.addToBFC(0, 4);
		bsc.addToBFC(6, 3);
		bsc.addToBFC(8, 3);
		bsc.addToBFC(2, 7);
		bsc.addToBFC(4, 5);
		bsc.addToBFC(3, 2);
		bsc.addToBFC(5, 8);
		
		System.out.print("result: ");
		
		bsc.searchToBFC(0);
	}
}
