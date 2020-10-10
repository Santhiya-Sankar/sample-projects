package interviewquestions;

import java.util.Scanner;

/**
 * @author santhiya.s
 *
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int num = 0, result = 0, remainder = inputNum;
		int inputSize = String.valueOf(inputNum).length();
		while(remainder != 0) {
			num = remainder % 10;
			result += Math.pow(num, inputSize);
			remainder /= 10;
		}
		System.out.println(result);
		if(inputNum == result) {
			System.out.println("The given number is armstrong number");
		}
		else
			System.out.println("The given number is not armstrong number");
	}

}
