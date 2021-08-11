package fundamentals;
import java.util.Scanner;
public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int digits = 0, num = n;
		while(num > 0) {
		digits++;
		num /= 10;
		}
		int newNum = 0;
		num = n;
		while(num > 0) {
		int last = num % 10;
		newNum += Math.pow(last, digits);
		num /= 10;
		}
		if(newNum == n) {
		System.out.println("true");
		}
		else {
		System.out.println("false");
		}
	}

}
