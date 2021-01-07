
public class FirstAssignment {
	private static int SumOfCubes(int n)
	{
		int sum =0;
		int digit=0;
		while(n!=0)
		{
			digit = n%10;
			sum = sum+ (digit*digit*digit);
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n, result;
		n = 111;
		result = SumOfCubes(n);
		System.out.println(result);
	}

}
