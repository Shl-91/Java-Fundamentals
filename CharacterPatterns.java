package fundamentals;
import java.util.Scanner;
public class CharacterPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner s= new Scanner(System.in);
			int n= s.nextInt();
			s.close();
			int i=1;
		

			while(i<=n)
			{
				char jthchar= (char)('A'+i-1);
				int j=1;
				while(j<=i)
				{
					System.out.print(jthchar);
					jthchar= (char)(jthchar+1);
					j=j+1;
				}
				System.out.println();
				i=i+1;

			} 
	}

}
