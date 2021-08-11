package fundamentals;
import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
	 	int i=1;
		 while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				//  System.out.print('*'+" ");
				 //System.out.print(i+" ");
				//System.out.print(j+" ");
				//System.out.print(n-j+1+" ");
				System.out.print(n);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		} 
		 
	
//		int i=n;
//		 while(i>0)
//		{
//			int j=n;
//			while(j>0)
//			{
//				//  System.out.print('*'+" ");
//				// System.out.print(i+" ");
//				System.out.print(j+" ");
//				//System.out.print(n-j+1+" ");
//				j=j-1;
//			}
//			System.out.println();
//			i=i-1;
//		} 

	}

}
