
public class FibNumbers {

	public static long fib(int n) {

		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else {
		return fib(n-1)+fib(n-2);
		
		}
		
	}
	
	public static void main(String[] args) {
		
		int num = 10;
		
		System.out.println("Term number " + num + " in the Fibonacci sequence is " +fib(num));

	}

}
