package fundamentals;
import java.util.Scanner;
public class Patterns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int i=n;
		while(i>0)
		{
			int j=n;
			while(j>0)
			{
				//  System.out.print('*'+" ");
				// System.out.print(i+" ");
				System.out.print(j+" ");
				//System.out.print(n-j+1+" ");
				j=j-1;
			}
			System.out.println();
			i=i-1;
		} 

	}

}
