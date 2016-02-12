class EvenFibonacciSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=1, j=2, k=0, sum = j;
		System.out.print(i + " " + j + " ");
		while((k=i+j) < 4000000)
		{
			i = j; j =k;
			System.out.print(k + " ");
			if(k%2 == 0) sum+=k;
		}
		System.out.println("\nSum= " + sum);
	}
}

