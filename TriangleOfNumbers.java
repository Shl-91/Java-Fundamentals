package fundamentals;
import java.util.Scanner;
public class TriangleOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int i=1;
		while (i<=n) {
			int spaces=1;
			while (spaces<=n-i) {
				System.out.print(" ");
				spaces=spaces+1;
			}
			int inc=1;
			int num=i;
			while(inc<=i)
			{
				System.out.print(num);
				num=num+1;
				inc=inc+1;
			}
			int dec=1;
			num=2*i-2;
			while(dec<=i-1)
			{
				System.out.print(num);
				num=num-1;
				dec=dec+1;
			}
			System.out.println();
			i=i+1;
		}
	}

}

//public class TriangleOfNumbers {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		s.close();
//		int i=1;
//		while (i<=n) {
//			int spaces=1;
//			while (spaces<=n-i) {
//				System.out.print(" ");
//				spaces=spaces+1;
//			}
//			int j=1;
//			int num=i;
//			while(j<=i)
//			{
//				System.out.print(num);
//				num=num+1;
//				j=j+1;
//			}
//			j=1;
//			num=2*i-2;
//			while(j<=i-1)
//			{
//				System.out.print(num);
//				num=num-1;
//				j=j+1;
//			}
//			System.out.println();
//			i=i+1;
//		}
//	}
//
//}
