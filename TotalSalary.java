package fundamentals;
import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		int basicSalary= s.nextInt();
		char grade= s.next().charAt(0);
		s.close();
		
		double hra= 0.2 * basicSalary;
		double da= 0.5 * basicSalary;
		int allow;
		
		if(grade=='A')
		{
			allow=1700;
		}
		else if(grade=='B')
		{
			allow= 1500;
		}
		else
		{
			allow=1300;
		}
		
		double pf= 0.11 * basicSalary;
	
		
		float totalSalary=(float)(basicSalary+hra+da+allow-pf);
		int total =Math.round(totalSalary);
		//System.out.println(Math.round(totalSalary));
		System.out.println(total);
		
	}

}
