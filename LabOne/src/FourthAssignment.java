import java.util.Scanner;
public class FourthAssignment {
	private static void Prime(int n)
	{
		int flag =0;
		if(n==2)
			System.out.println(n);
		else {
		for(int i =2; i<=n/2;i++)
		{
			if(n%i==0)
				flag=1;
			
		}
		if(flag ==0)
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i =2;i<=n;i++)
		{
			Prime(i);
		}
		sc.close();

	}

}
