/**
 * 
 * @author Ap00rva
 * date : 4/1/2021
 * 
 * Create a class with a method which 
 * can calculate the sum of first n natural numbers 
 * which are divisible by 3 or 5.
 */
public class FifthAssignment {
	
	private static int calculateSum(int n) {
		int sum =0;
		for(int i= 1;i<=n;i++)
		{
			if(i %3 == 0 || i% 5==0)
			{
				sum = sum + i;
			}
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
	    int	sum = FifthAssignment.calculateSum(n);
		System.out.println(sum);
		

	}

}
