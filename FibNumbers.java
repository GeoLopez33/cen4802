
public class FibNumbers {

	
	/**
	 * Recursive Style Method that allows you to find a 
	 * number within the Fibonacci sequence.
	 * @param n the index of the number from the Fibonacci sequence that you want to see.
	 * @return The number from the sequence
	 */
	public static long fib(int n) {

		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else {
		return fib(n-1)+fib(n-2);
		
		}
		
	}
	
	
	/**
	 * The variable num acts as the input when calling the fib method from main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num = 10;
		
		System.out.println("Term number " + num + " in the Fibonacci sequence is " +fib(num));

	}

}
