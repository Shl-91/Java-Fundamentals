package fundamentals;
import java.util.Scanner;
public class DiamondPatern {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int i=1;
		int n1=(n+1)/2;
		int n2=n/2;
		while(i<=n1)
		{
			
			int spaces=1;
			while(spaces <= n1-i)
			{
				System.out.print(" ");
				spaces= spaces+1;
			}
			int content=1;
			while(content <= 2*i-1)
			{	
				
			System.out.print("*");	
			content=content+1;
			
			}
			System.out.println();
			i=i+1;
		} 
//		int j=n2;
//		while(j>=1)
//		{
//			int spaces=1;
//			while(spaces <=n2-j+1)
//			{
//				System.out.print(" ");
//				spaces= spaces+1;
//		}
//			int content=1;
//			while(content <= 2*j-1)
//			{	
//				
//			System.out.print("*");	
//			content=content+1;
//			
//			}
//			System.out.println();
//			j=j-1;
//		} 

		 i=n2;
		while(i>=1)
		{
			int spaces=1;
			while(spaces <=n2-i+1)
			{
				System.out.print(" ");
				spaces= spaces+1;
		}
			int content=1;
			while(content <= 2*i-1)
			{	
				
			System.out.print("*");	
			content=content+1;
			
			}
			System.out.println();
			i=i-1;
		} 
	}

}
