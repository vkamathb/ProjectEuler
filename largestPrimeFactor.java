/*
 * Project Euler
 * 
 * Largest prime factor
 * Problem 3
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 */

public class largestPrimeFactor {
	
	static final long longNum = 600851475143L;

	public static void largestPrimeFact(long number)
	{
		int limit = (int)Math.sqrt(number)+1;
	    for (long i=3; i<limit; i+=2)
	    {
	        if (number%i==0)
	        {
	            System.out.println(i);
	            number = number/i;
	            limit = (int)Math.sqrt(number)+1;
	            i-=2;   //this is so it could check same prime again
	        }
	    }
	    System.out.println(number);
	}
	public static void main (String[] args)
	{
		largestPrimeFact(longNum);
	}

}
