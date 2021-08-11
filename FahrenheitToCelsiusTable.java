package fundamentals;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner r = new Scanner(System.in);
		int S= r.nextInt();
		int E= r.nextInt();
		int W= r.nextInt();
		r.close();
		int F=S;
		int C;
		while(F<=E)
		{
	        
	       C=(F-32)*5/9;
	       System.out.println(F+"\t"+C);
	        F=F+W;
	        
	        
		}
	}

}
