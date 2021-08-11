package fundamentals;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
         int n= s.nextInt();
         s.close();
         int num=1;
         for(int i=1;i<=n;i++)
         {
        	 num=3*i+2;
        	 if(num%4==0)
        	 {
        		n++;
        	 continue;
        	 }
        	 System.out.print(num+" ");
         }
	}

}
