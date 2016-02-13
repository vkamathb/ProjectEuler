
public class NthPrime {

	static final int n = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countPrime = 2; int primeNum = 0;
		System.out.print("Primes: ");
		for(int i=3; ; i+=2)
		{
			for(int j=3; j<=(int)Math.sqrt(i)+1; j+=1)
			{
				if(i%j == 0)
				{
					break;
				}
				else if(j >= (int)Math.sqrt(i)+1)
				{
					countPrime++;
					primeNum = i;
					System.out.println(i + " ");
				}
				/*if(i%j == 0)
				{
					if(j == i)
					{
						countPrime++;
						primeNum = i;
						System.out.println(i + " ");
					}
					else
						break;
				}*/
			}
			if(countPrime == n) break;
		}
		System.out.println("\n" + n + "th prime number=" + primeNum);
	}

}
