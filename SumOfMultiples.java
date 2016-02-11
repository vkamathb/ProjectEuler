/* Code is built and compiled on IDEOne and Saving it here on Github */
/* 
Problem 1: Multiples of 3 and 5
  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
  The sum of these multiples is 23.
  Find the sum of all the multiples of 3 or 5 below 1000.
*/

/* Solution */
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
  public static void sumOfMultiples()
	{
		int sum = 0;
		for(int i = 0; i<1000; i++)
		{
			if((i%3 == 0)&&(i%5 == 0)) sum+=i; 
			else if(i%3 == 0) sum+=i;
			else if(i%5 == 0) sum+=i;
			else continue;
		}
		System.out.println("sum =" + sum);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		sumOfMultiples();
	}
}
