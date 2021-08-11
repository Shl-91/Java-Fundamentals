package fundamentals;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		long binary=0;
		int pv=1;
		while(n!=0)
		{
			int digit=n%2;
			binary=binary+(digit*pv);	
			pv *=10;
			n=n/2;	
		}
		System.out.println(binary);
	}

}
