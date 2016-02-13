/*
 * Smallest multiple
 * Problem 5
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 */

import java.util.ArrayList;

public class LCMofNumbers {

	public static final int maxNum = 20;
	
	static long gcd(long a, long b)
	{
		while(b != 0) {
			long t = b;
			b = a %b;
			a = t;
		}
		return a;
	}
	
	static long lcm(long a, long b)	{
		long result = ((a*b)/gcd(a,b));
		System.out.println("Lcm of " + a + " and " + b + " = " + result);
		return (result);
	}
	
	static long findLCM(ArrayList<Integer> numList, int i, int j, int max)
	{
		if(i == (max-1)) return lcm(1, 2);
		else return lcm(numList.get(i), findLCM(numList, i+1, j+1, max));
	}
	
	public static void main(String[] args) {

		 ArrayList<Integer> numList = new ArrayList<Integer>();
		 
		 for(int i=maxNum; i>0; i--)
			 numList.add(i);
		 
		 long result = findLCM(numList, 0,1,maxNum);
		 System.out.println("Result:" + result);
	}	
}
