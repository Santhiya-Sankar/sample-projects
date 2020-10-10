package interviewquestions;

import java.util.Scanner;


/**
 * @author santhiya.s
 *
 */
/**
 * @author santhiya.s
 *
 */
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String to check palindrome : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		checkPalindromeUsingStringBuilder(input);
		checkPalindromeUsingRecursion(input);
		System.out.println("\nEnter the integer to check palindrome : ");
		int intInput = sc.nextInt();
		checkPalindromeForInteger(intInput);
		sc.close();
	}
	
	private static void checkPalindromeForInteger(int intInput) {
		int remainder = intInput, result = 0, num = 0;
		while(remainder != 0) {
			num = remainder % 10;
			result = result * 10 + num;
			remainder /= 10;
		}
		System.out.println("Palindrome For Integers : " + result + " & Palindrome state : " + (intInput==result));
	}

	private static void checkPalindromeUsingRecursion(String input) {
		String output = reverse(input);
			System.out.println("Palindrome using Recursion : " + output + " & Palindrome state : " + input.equals(output));
	}
	
	private static String reverse(String input) {
		if(input == null || input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length()-1) + reverse(input.substring(0, input.length()-1));
	}

	/**
	 * @param input
	 */
	public static void checkPalindromeUsingStringBuilder(String input) {
		char[] arr = input.toCharArray();
		StringBuilder sb = new StringBuilder(arr.length);
		for(int i = arr.length-1; i>=0; i--) {
			sb.append(arr[i]);
		}
		System.out.println("Palindrome using String Builder : "+ sb + " & Palindrome state : " +input.equals(sb.toString()));
	}

}
