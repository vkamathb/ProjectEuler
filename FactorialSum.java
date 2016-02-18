/*
 * Project Euler
 * 
 * Factorial digit sum
 * Problem 20
 *
 * n! means n x n-1 x ... x 3 x 2 x 1
 *
 * For example 10! = 10 x 9 x ... x 3 x 2 x 1 = 3628800, 
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * 
 * Find the sum of the digits in the number 100!
 * 
 */

import java.math.BigInteger;

public class FactorialSum {

	private static long x = 100;
	static final BigInteger n = BigInteger.valueOf(x);
	
	static void sumOfDigits(BigInteger bigNum) {
		
		BigInteger sum = BigInteger.ZERO;
		while(bigNum.compareTo(BigInteger.ZERO) > 0)
		{
			sum = sum.add(bigNum.mod(BigInteger.TEN));
			bigNum = bigNum.divide(BigInteger.TEN);
		}
		System.out.println("Sum = " + sum);
	}
	
	static BigInteger factorial(BigInteger num) {
		
		BigInteger product = BigInteger.ONE;
		while(!num.equals(BigInteger.ZERO))
		{
			product = product.multiply(num);
			num = num.subtract(BigInteger.ONE);
		}
		return product;
	}
	
	public static void main(String[] args) {
		
		BigInteger x = factorial(n);
		sumOfDigits(x);
		System.out.println("Done");
	}
}

