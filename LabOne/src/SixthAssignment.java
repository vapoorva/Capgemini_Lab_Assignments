
public class SixthAssignment {
	private static int calculateDifference(int n)
	{ int sumOfSquares, squareOfSum,sum;
	sumOfSquares = 0;
	squareOfSum = 0;
	sum =0;
	  for(int i =1; i<=n ;i++)
	  {
		  sumOfSquares= sumOfSquares+(i*i);
		  squareOfSum = squareOfSum +i;
	  }
	  sum = sumOfSquares - (squareOfSum * squareOfSum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		int result = SixthAssignment.calculateDifference(n);
		System.out.println(result);

	}

}
