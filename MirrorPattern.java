package fundamentals;
import java.util.Scanner;
public class MirrorPattern {

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
				System.out.print("*");
			//System.out.print(content);	
			content=content+1;
			}
			System.out.println();
			i=i+1;
		} 

	}

}
