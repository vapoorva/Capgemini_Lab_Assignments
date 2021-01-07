/**
 * @author Ap00rva
 * Date: 5/1/2021
 */
public class SeventhAssignment {

	private static boolean checkNumber (int n)
	{
		int firstTerm, secondTerm;
		firstTerm =0;
		secondTerm = 0;
		firstTerm = n%10;
		n=n/10;
		
		while(n!=0)
		{
			secondTerm =n %10;
			n=n/10;
			if(firstTerm >= secondTerm)
			{
				firstTerm = secondTerm;
				continue;
			}
			else
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n = 34468;
      System.out.println(SeventhAssignment.checkNumber(n));
	}

}
