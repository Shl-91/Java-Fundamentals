package fundamentals;
import java.util.Scanner;
public class CharacterPatterns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int i=1;
		while(i<=n)
		{
			int j=1;
			char jthchar= (char)('A'+n-i);
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
