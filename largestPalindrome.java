/*
 * Project Euler
 * 
 * Largest palindrome product
 * Problem 4
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 */

public class largestPalindrome {
	
	public static boolean isPalindrome(int k)
	{
		String temp = String.valueOf(k);
		
		int len = temp.length();
		for(int i=0; i<len/2; i++)
			if(temp.charAt(i) != temp.charAt(len-i-1)) return false;
		return true;
	}

	public static void main(String[] args) {
		
		int k=0, largest=0, num1 = 0, num2=0;
		for(int i=999; i>=100 ; i--)			//Start at 999 and decrement till 100
			for(int j =110; j<=i; j+=11) 		//Palindrome is divisible by 11. Hence starting from smallest 3 digit multiple of 11.
			{
				k=i*j;
				if(isPalindrome(k))
					if(largest<k){
						largest = k; num1 = i; num2 = j;
					}
			}
		System.out.println("Largest = " + largest + " for " + num1 + "," +num2);
	}
}
