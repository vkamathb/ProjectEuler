/*
 * Project Euler
 * 
 * Multiples of 3 and 5
 * Problem 1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */

class SumOfMultiples
{
  public static void sumOfMultiples()
	{
		int sum = 0;
		for(int i = 0; i<1000; i++)
			if((i%3 == 0)||(i%5 == 0)) sum+=i;
		System.out.println("sum =" + sum);
	}
	public static void main (String[] args)
	{
		sumOfMultiples();
	}
}
