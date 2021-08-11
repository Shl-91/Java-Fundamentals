package fundamentals;
import java.util.Scanner;
public class SquareRootIntegral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();	
		
		int i=1;
		while(true)
		{ 
			
			if(i*i>n)
			{
				
				System.out.println(i-1);
			}
				else if(i==n)
				{
					System.out.println(i);
			}
				
					i++;
		}
			
		}
		
	}
	


