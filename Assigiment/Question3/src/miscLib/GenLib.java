package miscLib;

public abstract class GenLib{
	public static int getInt(int start, int end){
		if (start > end){
			int temp = start;  
            start = end;  
            end = temp;
			}
		
		return ((int)(Math.random()*(end-start+1))+start);
	}

public static void main (String [] args){
    int temp ;
    temp = getInt(50,10);
    System.out.println(temp);
    }
}


