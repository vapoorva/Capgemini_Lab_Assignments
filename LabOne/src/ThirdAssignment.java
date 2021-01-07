
public class ThirdAssignment {

	private static int Fibonnaci(int n) {
		int firstTerm = 0;
		int secondTerm = 1;
		int thirdTerm = 0;
		
		if (n==1)
			return firstTerm;
		else
			if(n==2)
				return thirdTerm;
			
		for(int i=3; i<=n ; i++)
		{
			thirdTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
		}
		return thirdTerm;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int term = Fibonnaci(4);
		System.out.println(term);
		
	}

}
