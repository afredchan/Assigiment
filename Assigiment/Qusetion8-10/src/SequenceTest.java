
public class SequenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    BinarySearchTree tree = new BinarySearchTree();
	    System.out.println("Inserting :");
	    
	    int[] number = {2,7,9,4,1,5,3,6,0,8};
	    
	    for (int k = 0; k < number.length; k++) {
	      
	    	int data = number[k];  
	    	System.out.print(data + " ");
	    	tree.insert(data);
	    }
	    
	    System.out.println();
	    tree.inorder();
	    tree.delete(2);
	    tree.inorder();

	}

}
