package fundamentals;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		s.close();
		int i=1;
		while (i<=10) {
			System.out.println(i*N);
			i=i+1;
			
		}
       
	}

}
