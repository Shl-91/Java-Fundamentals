package fundamentals;
import java.util.Scanner;
public class CheckNumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		  int n = s.nextInt();
		  int[]num=new int [n];
		  int count = 0;
		  boolean isDec=true;
		  for (int i=0;i<n;i++)
		  {
		   num [i] = s.nextInt();  
		     }
		 for(int i=0;i<n-1;i++)
		 {
			 if(num[i]==num[i+1])
				{
					count=2;
				}
			 else if(num[i]<num[i+1])
				{
					if(isDec==true)
					{
						isDec=false;
					count++;
					}
				} 
				else
				{
					if(isDec==false)
					{
						count=2;
					}

				}
		  
		 }
		 if(count<=1)
				System.out.println("true");
				else
					System.out.println("false");
		 s.close();
	}

}
