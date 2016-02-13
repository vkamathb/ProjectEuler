/*
 * Project Euler
 * 
 * Power digit sum
 * Problem 16
 *
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 21000?
 * 
 */

import java.math.BigInteger;

public class PowerDigitSum {

	static final int base = 2;
	static final int exponent = 1000;
	
	public static void main(String[] args) {
	
		/* 
		BigInteger b1 = new BigInteger(Integer.toString(base));
		BigInteger result = b1.pow(exponent);
		String strResult = result.toString();
		*/
		
		String strResult = (new BigInteger(Integer.toString(base)).pow(exponent)).toString();
		
		int digitSum = 0;
		for(int i=0; i<strResult.length(); i++)
			digitSum+= Character.getNumericValue(strResult.charAt(i));
		System.out.println(digitSum);
	}
}
