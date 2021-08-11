package fundamentals;
import java.util.Scanner;
public class SumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int sum=0;
		int i=1;
		while(i<=n)
		{
			sum=0;
			int j=1;
			while(j<=i)
			{
				sum=sum+j;
				System.out.print(j);
				if(j<i)
				{
					System.out.print("+");
				}
				j=j+1;
			}
			System.out.println("="+sum);
			i=i+1;
		}
	}
}
