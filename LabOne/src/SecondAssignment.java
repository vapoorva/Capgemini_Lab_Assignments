import java.util.Scanner;
public class SecondAssignment {
	private static void Signal( String n)
	{
		if(n.equalsIgnoreCase("red"))
			System.out.println("stop");
		
		else 
			if(n.equalsIgnoreCase("yellow"))
			System.out.println("wait");
		else
			if(n.equalsIgnoreCase("green"))
			System.out.println("go");
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String code = sc.next();
		Signal(code);
		sc.close();
	}

}
