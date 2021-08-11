package fundamentals;
import java .util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int count;
		for(int i=2;i<=n;i++)
		{
			 count=0;
			 for(int j=1;j<=i;j++)
			 {
				 if(i%j==0)
				 {
					 count++;
				 }
			 }
			 if(count==2)
			 {
				 System.out.println(i);
			 }
	
		}


	}

}
