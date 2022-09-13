import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		String n;
		int s=0;
		String a="father";
		String b="cry";
		String c="green";
		String d="aeroplan";
		System.out.println("Arrange The Words:\nRAEHTF");// First question
		Scanner g = new Scanner(System.in); 
			n=g.nextLine();
			if (n.equals(a)) {
				System.out.println("Correct!!");
				s++;
			}
			else {
				System.out.println("Wrong");
			}
		System.out.println("Arrange The Words:\nCYROTNU");  //Second question
		n=g.nextLine();
		if(n.equals(b)) {
			System.out.println("Correct!!");
			s++;
			}
		else {
			System.out.println("Wrong:(");
		}
	    System.out.println("Arrange The Words:\nRENEG");  //Third question
	     n=g.nextLine();
	        if(n.equals(c)) {
	        	System.out.println("Correct!!");
	        	s++;
	        }
	        else {
	        	System.out.println("Wrong");
	        }
	   System.out.println("Arrange The Words:\nOAERELANP");  //Fourth question
	   n=g.nextLine();
	      if(n.equals(d)) {
	    	  System.out.println("Correct!!");
	    	  s++;
	      }
	      else {
	    	  System.out.println("Wrong....");
	      }
	  System.out.println("Net Score is ="+s);
	}
	
}
