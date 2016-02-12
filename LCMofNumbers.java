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
		if(i == (max-1))
		{
			return lcm(1, 2);
		}
		else return lcm(numList.get(i), findLCM(numList, i+1, j+1, max));
	}
	
	public static void main(String[] args) {

		 ArrayList<Integer> numList = new ArrayList<Integer>();
		 
		 for(int i=maxNum; i>0; i--)
		 {
			 numList.add(i);
		 }
		 
		 long result = findLCM(numList, 0,1,maxNum);
		 System.out.println("Result:" + result);
		 
		 /*for(int i=0; i<maxNum; i++)
		 {
			 for(int j=i+1; j<maxNum; j++)
			 {
				 if(numList.get(j) == 1) continue;
				 if(numList.get(i)% numList.get(j)== 0) numList.set(i, Integer.valueOf(1)); 
			 }
		 }*/

	}	

}
