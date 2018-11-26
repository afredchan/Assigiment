public class Test {

    public static void main(String[] args) {
        int number = (int) Math.floor(Math.random() * (2000 - 1 + 1)) + 1;
        
        System.out.println("number of result: " + number);
        int answer = SearchInNumber(number);
        System.out.println("answer of result: " + answer);
    }  
    
    static public int SearchInNumber(int number) {
        int left = 1, right = 2000;
        while (left <= right) {
        	
            int middle = (right + left) / 2;

            if (middle == number) {
                return middle;
            }

            if (middle > number) {
                right = middle - 1;
                System.out.println(middle);
                System.out.print("lower : ");
                
            } else {
                left = middle + 1;
                System.out.println(middle);
                System.out.print("higher  :");
            }
        }
        return -1;
    }
}
