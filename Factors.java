package fundamentals;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s= new Scanner(System.in);
	int n= s.nextInt();
	s.close();
	int i=2;
	
	while(i<n)
	{
		if(n%i==0)
			System.out.print(i+" ");
		i=i+1;
	}
	
	}

}
