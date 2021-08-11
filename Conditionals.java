package fundamentals;
import java.util.Scanner;
public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter No");
		int n= s.nextInt();
		s.close();
		if(n%2==0){
			System.out.println("no is even");
		}
		else
		{
			System.out.println("no is odd");
		}
	}

}


