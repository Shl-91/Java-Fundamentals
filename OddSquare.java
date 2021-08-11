package fundamentals;
import java.util.Scanner;
public class OddSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        s.close();
	        int i = 1;
	        int maxOdd = 1+(n-1)*2;
	        int oddCount =0;
	        while(i<=n){
	            int j =1;
	            int odd=1;
	            odd=odd+oddCount;
	            while(j<=n){
	                
	                if(odd>maxOdd){
	                     odd=1;
	                }
	                System.out.print(odd);
	                odd=odd+2;
	                j=j+1;
	               
	            }
	            System.out.println();
	            i=i+1;
	            oddCount= oddCount+2;
	            
	        }
	}

}
