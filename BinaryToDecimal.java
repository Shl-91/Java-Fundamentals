package fundamentals;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int decimal=0;
		int pv=1;
		while(n!=0)
		{
			int digit=n%10;
			decimal=decimal+(digit*pv);	
			pv *=2;
			n=n/10;	
		}
		System.out.println(decimal);
	}

}
