
public class EightAssignment {
	private static boolean checkNumber(int n)
	{
		 if(n==1)
				return true;
	else if(n%2!=0)
			return false;
		
		return checkNumber(n/2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =20;
		System.out.println(EightAssignment.checkNumber(n));
	}

}
