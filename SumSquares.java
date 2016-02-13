
public class SumSquares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long sumOfSquares = 0;
		int sumOfNumber = 0;
		
		for(int i=1; i<=100; i++)
		{
			sumOfSquares += (long)(i*i);
			sumOfNumber += i;
		}
		//System.out.println(sumOfSquares);
		long result =  (sumOfNumber * sumOfNumber) - sumOfSquares;
		System.out.println(result);
	}

}
