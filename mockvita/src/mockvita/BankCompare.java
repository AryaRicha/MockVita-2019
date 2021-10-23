/**
 * 
 */
package mockvita;
import java.util.*;
import java.lang.*;


/**
 * @author PC
 *
 */
public class BankCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long p=s.nextLong();
		s.nextLine();
		int t=Integer.parseInt(s.nextLine());
		int n1=Integer.parseInt(s.nextLine());
		double emi[]=new double[2];
		
		for(int i=0;i<n1;i++)
		{
			String str=s.nextLine();
			String str1[]=str.split(" ");
			int s1=Integer.parseInt(str1[0]);
			double in=Double.parseDouble(str1[1]);
			 emi[0]=emi[0]+(p*t)/(1-(1/Math.pow((1+in),(12*s1))));
			
			
		}
		int n2=Integer.parseInt(s.nextLine());
		for(int i=0;i<n1;i++)
		{
			String str=s.nextLine();
			String str1[]=str.split(" ");
			int s1=Integer.parseInt(str1[0]);
			double in=Double.parseDouble(str1[1]);
			 emi[1]=emi[1]+(p*t)/(1-(1/Math.pow((1+in),(12*s1))));
			
			
		}
		System.out.println(emi[0]+" "+emi[1]);
		if(emi[0]>emi[1])
			System.out.println("Bank A");
		else
			System.out.println("Bank B");
		

	}

}
