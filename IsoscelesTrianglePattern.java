package fundamentals;
import java.util.Scanner;
public class IsoscelesTrianglePattern {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int i=1;
		while(i<=n)
		{
			int spaces=1;
			while(spaces <= n-i)
			{
				System.out.print(" ");
				spaces= spaces+1;
			}
			int content=1;
			while(content<=i)
			{
				
			//System.out.print(content);	
			System.out.print("*");	
			content=content+1;
			}
			int content2=i-1;
			while(content2 >= 1)
			{
				//System.out.print(content2);	
				System.out.print("*");
				content2=content2-1;
			}
			System.out.println();
			i=i+1;
		} 

	}

}
