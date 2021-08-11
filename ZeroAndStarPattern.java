package fundamentals;

import java.util.Scanner;

public class ZeroAndStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int start = 1;
		int end = 2*n + 1;
		int mid = n + 1;
		for(int i = 1; i <= n; i++)
		{
		for(int j = 1; j <= 2*n + 1; j++)
		{
		if(j == start || j == end || j == mid)
		{
		System.out.print("*");
		}else{
		System.out.print('0');
		}
		}
		start++;
		end--;
		System.out.println();
		}
	}
}
		
//		Scanner s= new Scanner(System.in);
//		int n= s.nextInt();
//		s.close();
//		    int i,j;  
//		    for(i=1;i<=n;i++)
//		    {
//		      for(j=1;j<=n;j++)
//		      {  
//		          if(i==j)  
//		             System.out.print("*");  
//		            else  
//		           System.out.print("0");  
//		      }  
//		      j--;  
//		       System.out.print("*");  
//		      while(j>=1)
//		      {  
//		          if(i==j)  
//		           System.out.print("*");  
//		          else  
//		           System.out.print("0");  
//		          j--;  
//		      }  
//		    System.out.println("");  
//		  }  
//    }
// }


