/* 
 * The objective is to make a program which finds the given Fibonacci Number without using a temporary variable.
 * Do this objective both with a straightforward looping method and a recursive method.
 * 
*/

/*import Scanner is used to take input from the console*/
import java.util.Scanner;

/*Class naming must match name of file*/
public class FibonacciNumber{

	/***Main Method***/
	/* 
	 * "Hello World" is there to check if needed
	 * Scanner used to take input from keyboard
	 * If input is an integer, then call Fibonacci function. This can be straightforward or recursive
	 * Else the input is not an integer
	 * Prints out the Fibonacci Number of the given integer
	*/
	public static void main(String[] args) {
        
        //System.out.println("Hello World!");
		
		System.out.println("What Number of the Fibonacci Sequence would you like to know?\n");
		
		Scanner inputCMDLine = new Scanner(System.in);
		
		if(inputCMDLine.hasNextInt()) {
			int FibNumb = inputCMDLine.nextInt();
			int Total = Fibonacci(FibNumb);
			System.out.println("\nThe number corresponding to the " + FibNumb + " number in the Fibonacci sequence is: " + Total);
		}
		else{
			System.out.println("\nThat was an invalid input!");
		}
    } 

	/***Straightforward***/
	/* 
	 * Fibonacci function. Must be called with an integer
	 * Integer Previous: the previous number in the Fibonacci sequence
	 * Integer Total: the total value of the called integer in the Fibonacci sequence 
	 * Returns Total
	 
	 * If FibNumb = 0, Fibonacci value is 0
	 * Else it adds to the total until it breaks the For loop
	 
	 *Uncomment and then comment out Recursive - Public in order to run this function
	*/
	public static int Fibonacci(int FibNumb){
		
		int Previous = 0;
		int Total = 1;
		
		if(FibNumb == 0){
			return 0;
		}
		
		for(int i = 1; i < FibNumb; i++){
			Total = Total + Previous;
			Previous = Total - Previous;
		}
		
		return Total;
	}
	
	/***Recursive***/
	/***Public***/
	/* 
	 * Fibonacci function. Must be called with an integer
	 * Integer countNum: counts the recursion number
	 * Integer Total: the total value of the called integer in the Fibonacci sequence
	 * Integer Previous: the previous number in the Fibonacci sequence 

	 * Returns the Recursive - Private function

	 *Uncomment and then comment out Straightforward in order to run this function
	*/
	/*public static int Fibonacci(int FibNumb){
		
		int countingNum = 1;
		int Total = 1;
		int Previous = 0;
		
		return Fibonacci(FibNumb, countingNum, Total, Previous);
	}*/
	
	/***Recursive***/
	/***Private***/
	/* 
	 * If FibNumb = 0, Fibonacci value is 0
	 * Else if FibNumb <= the countingNum, then return the Current value
	 * Else update Current total, the new previous, and finally return the Recursive - Private function
	*/
	private static int Fibonacci(int FibNumb, int countingNum, int Current, int Previous){
		
		if(FibNumb == 0){
			return 0;
		}
		else if(FibNumb <= countingNum){
			return Current;
		}
		else{
			Current = Current + Previous;
			Previous = Current - Previous;
			return Fibonacci(FibNumb, countingNum+1, Current, Previous);
		}
	}
}

