package dataStructures;

/**
 * @author santhiya.s
 *
 */
public class Recursion_TowersOfHanoi {
	
	 static void towersOfHanoi(int n, char from_rod, char to_rod, char using_rod) {
		 if(n==1) {
			 System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
			 return;
		 }
		 else {
			 towersOfHanoi(n-1, from_rod, using_rod, to_rod);
			 System.out.println("Move disk " +n + " from rod " +from_rod +  " to rod " +to_rod);
			 towersOfHanoi(n-1, using_rod, to_rod, from_rod);
		 }
	 }
	 
	 public static void main(String args[]) {
		 towersOfHanoi(2, 'A', 'C', 'B');
		
	}

}
