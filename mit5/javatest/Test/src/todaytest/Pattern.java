package todaytest;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n+1;
		for(int i=1;i<=n;i++) {
			
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int s=1;s<=sp;s++) {
				System.out.print(" ");
				
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
		
			System.out.println();
			sp=sp-2;
		}
		
	}

}
