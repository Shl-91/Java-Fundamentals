package fundamentals;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int C=s.nextInt();
		s.close();
		int sum=0, Product=1;
		for(int i=1;i<=N;i++)
		{
			sum=sum+i;
			Product=Product*i;
		}
		if(C==1)
			System.out.println(sum);
		else if (C==2)
			System.out.println(Product);
		else
			System.out.println(-1);
		
	}

}
