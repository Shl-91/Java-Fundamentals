package fundamentals;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int rev=0;
		for(int i=n;i!=0;i/=10) 
		{
			int num=i%10;
			rev=(rev*10)+num;
			
		}
		//		while(n!=0)
		//		{
		//			int num=n%10;
		//			rev=(rev*10)+num;
		//			n=n/10;
		//		}

		System.out.println(rev);

	}

}
