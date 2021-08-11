package fundamentals;
import java.util.Scanner;
public class FibnacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int N=s.nextInt();
s.close();
int F1=1;
int F2=1;
int F=1;
for(int i=1;i<=N-2;i++)
{
	
	  F=F1+F2;
	
	F1=F2;
	F2=F;
	
}
System.out.println(F);
	}

}
