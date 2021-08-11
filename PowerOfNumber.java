package fundamentals;
import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
		int n= s.nextInt();
		s.close();
		int i=1;
		int temp=x;
		if (n==0)
		{
			System.out.println(1);
		return;
		}
		while(i<n)
		{
			
			temp= temp*x;
			i=i+1;
			
			
		}
		
		System.out.println(temp);
	}

}
