package fundamentals;
import java.util.Scanner;
public class TriangularPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int i=1;
		int p=1;

		while(i<=n)
		{
			//int p=i;
			int j=1;
			while(j<=i)
			{
				//  System.out.print('*'+" ");
				//System.out.print(i+" ");
				//System.out.print(j+" ");
				//System.out.print(n-j+1+" ");
				//System.out.print(n);
				System.out.print(p+" ");
				p++;
				//p=p-1;
				j++;
			}
			System.out.println();
			i=i+1;

		} 
	}

}
