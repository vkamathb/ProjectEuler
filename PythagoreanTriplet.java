/*
 * Project Euler
 * 
 * Special Pythagorean triplet
 * Problem 9 : A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a2 + b2 = c2
 *
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. 
 * 
 * Find the product abc.
 * 
 */

public class PythagoreanTriplet {

	static final int findPySum =1000;
	
	static void findPySum(int sumValue)
	{
		for(int a = 1; a<sumValue; a++)
			for(int b = a+1; b < sumValue-a; b++)
			{
				int c = sumValue - a - b;
				if((c*c == a*a + b*b))
					System.out.println("Pythagorean Triplet for Sum=" + sumValue + " is " + a + "," + b + "," + c + 
							".\nProduct= " + (a*b*c));
			}
	}
	
	public static void main(String[] args) {

		long lStartTime = System.currentTimeMillis(); //profiling start

		findPySum(findPySum);
		
		long lEndTime = System.currentTimeMillis(); //profiling end
		long difference = lEndTime - lStartTime;

		System.out.println("Elapsed Time in msec: " + difference);
	}
}
