/*
 * Project Euler
 * 
 * Summation of primes
 * Problem 10
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million (20000000)
 *
 */

public class SumOfPrimes {

	static final int n = 2000000;  //Finding until this number.
	
	public static void main(String[] args) {
		
		long sumPrimes = 5;  //Starting at 5 because we are skipping  2 and 3
		System.out.println("Primes: ");
		for(int i=3; i<n ; i+=2)
		{
			for(int j=3; j<=(int)Math.sqrt(i)+1; j+=1) //try a match until sqrt of the number.
			{
				if(i%j == 0)
				{
					break;							// if match found, then i is a multiple of j. i will not be a prime.
				}
				else if(j >= (int)Math.sqrt(i)+1)   // else a Match !! means it is a prime.
				{
					System.out.println(i + " ");
					sumPrimes += i;
				}
			}
		}
		System.out.println();
		System.out.println("Sum of " + n + "prime numbers=" + sumPrimes);
	}

}
