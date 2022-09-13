import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("Enter any two number:");
		int a,b,ch;
		try(Scanner s=new Scanner(System.in)){
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter you're choice'\n'1.Addition'\n'2.Multiply'\n'3.Subtraction");
		ch=s.nextInt();
		}
		switch(ch) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a*b);
			break;
		case 3:
			System.out.println(a-b);
			break;
		}
		

	}

}
