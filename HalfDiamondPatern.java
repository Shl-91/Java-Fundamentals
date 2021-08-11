package fundamentals;
import java.util.Scanner;
public class HalfDiamondPatern {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int n1=n+1;
		int n2=n;
		
		if(n==0)
        {
            System.out.println("*");
        }
		
		int i=1;
		while(i<=n1)
		{
			int stars=1;
			while(stars<=1)
			{
				System.out.print("*");
				stars=stars+1;
			}
			
			int incnum=1;
			int num=1;
			while(incnum<=i-1)
			{

				System.out.print(num);
				num=num+1;
				incnum=incnum+1;
			}
			int decnum=1;
			num=i-2;
			while(decnum<=i-2)
			{
				
					System.out.print(num);
					num=num-1;
					decnum=decnum+1;
			}
			stars=1;
			while(stars<=1)
			{
				if(i==1)
				{
					System.out.print("");
				}
				else
				{
				System.out.print("*");
				}
				stars=stars+1;
			}

			System.out.println();
			i=i+1;
		} 
		
		i=n2;
		while(i>=1)
		{
			int stars=1;
			while(stars<=1)
			{
				System.out.print("*");
				stars=stars+1;
			}
			
			int incnum=1;
			int num=1;
			while(incnum<=i-1)
			{

				System.out.print(num);
				num=num+1;
				incnum=incnum+1;
			}
			int decnum=1;
			num=i-2;
			while(decnum<=i-2)
			{
				
					System.out.print(num);
					num=num-1;
					decnum=decnum+1;
			}
			stars=1;
			while(stars<=1)
			{
				if(i==1)
				{
					System.out.print("");
				stars=stars+1;
				}
				else
				{
				System.out.print("*");
				stars=stars+1;
				}
			}

			System.out.println();
			i=i-1;
		} 

	}
}


