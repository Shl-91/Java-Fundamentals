package fundamentals;
import java.util.Scanner;
public class TriangularSumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=2*i+1)
			{
				
				System.out.print("=");
				j=j+1;
			}
			System.out.println();
			i=i+1;

		} 
	}

}
