package interviewquestions;

import java.util.Scanner;

/**
 * @author santhiya.s
 *
 */
public class Fibinocci_Series {

	public static void main(String[] args) {
		System.out.println("Enter the number for which fibinocci series is to find : ");
		// TODO Auto-generated method stub
		int getNumber = new Scanner(System.in).nextInt();
		System.out.println("The fibinocci series for the given number " +getNumber + " is : ");
		System.out.println("\nIterative fibinocci : ");
		for(int i=1; i<= getNumber; i++) {
		System.out.print(iterativeFibinocci(i) + " ");
		}
		System.out.println("\nRecursive fibinocci : ");
		for(int i=1; i<= getNumber; i++) {
			System.out.print(recursiveFibinocci(i) + " ");
			}
	}
	
	/**
	 * @param i number
	 * @return fibinoccci value of the entered number
	 */
	private static int recursiveFibinocci(int i) {
		if(i == 1 || i == 2) {
			return 1;
		}
		return recursiveFibinocci(i-1) + recursiveFibinocci(i-2);
	}


	// iterative method
	/**
	 * @param num
	 * @return fibinoccci value of the entered number
	 */
	public static int iterativeFibinocci(int num) {
		int fib_1 = 1, fib_2 = 1, fibinocci = 1;
		for(int i=3; i<= num; i++) {
			fibinocci = fib_1 + fib_2;
			fib_1 = fib_2;
			fib_2 = fibinocci;
		}
		return fibinocci;
	}

}
