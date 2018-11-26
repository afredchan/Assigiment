
public class SequenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10, 7, 8, 9, 1, 5, 15, 19}; 

		QuickSort quicksort = new QuickSort(); 
		quicksort.sort(array, 0, array.length-1); 

		System.out.print("Result: "); 
		quicksort.printSequence(array); 

	}

}
