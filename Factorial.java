import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter any Number: ");
	
			int n,fact=1;
			try (Scanner f = new Scanner(System.in)) {
				n=f.nextInt();
			}
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of "+n+" is "+fact);
		}
		

	}


