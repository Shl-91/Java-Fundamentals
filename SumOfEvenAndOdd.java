package fundamentals;
import java.util.Scanner;


public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		s.close();
		int temp=N;
		int evenSum=0;
		int oddSum=0;

		while(temp!=0)
		{
			int i=temp%10;
			if(i%2==0)
			{
				evenSum=evenSum+i;
			}
			else
			{
				oddSum=oddSum+i;
			}
			temp=temp/10;
		}

		System.out.println(evenSum+" "+oddSum);


	}

}
