package interviewquestions;

import java.util.Scanner;

/**
 * @author santhiya.s
 *
 */
class PrimeNumber {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the from number to find prime number : ");
		int from = sc.nextInt();
		System.out.println("Enter the to number to find prime number : ");
		int to = sc.nextInt();
		for(int i = from; i<= to; i++) {
			int result = getPrimeNumber(i);
			
			if(result == -1) {
				System.out.println("Enter the valid number. (i.e., greater than 0)  " + result );
				break;
			}
			else if(result == 0)
				continue;
			else
				System.out.print(result + " ");
		}
	}
	
	/*//this method is not functioning properly
	public static int getPrimeNumber(int num) {
		if(num < 0)
			return -1;
		if(num == 0 || num == 1) 
			return 0;
		if(num == 2 || num == 3)
			return num;
		if(((num * num) -1) % 24 == 0)
			return num;
		else
			return 0;
	}
	*/
	public static int getPrimeNumber(int number) {
		if (number == 2 || number == 3) { 
			return number; 
			}
		if (number % 2 == 0 || number == 1) {
			return 0; 
			}
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 3; i < sqrt; i += 2) {
			if (number % i == 0) {
				return 0; 
				}
			}
		return number;
	}
}

//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
