package mockvita;
import java.util.*;
import java.math.*;
import java.lang.*;
public class BankTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		float a=Float.parseFloat(s.nextLine());
		int r=Integer.parseInt(s.nextLine());
		int preid=0,mid=0,mamt=0,x=0,y=0,tid=0;
		long sum=0;
		String mstr=null;
		Integer bal[]=new Integer[r-2];
		for(int i=0;i<r-2;i++)
		{
			String str1=s.nextLine();
			String str2[]=str1.split(" ");
			tid=Integer.parseInt(str2[0]);
			int amount=Integer.parseInt(str2[1]);
			String str=str2[2];
			bal[i]=Integer.parseInt(str2[3]);
			if(tid!=preid+1)
			{
				mid=tid;
				mamt=amount;
				mstr=str;
				
			}
			preid=tid;
			
		}
		//Double tint =s.nextDouble();
		BigDecimal tint1= new BigDecimal(String.valueOf(s.nextDouble()));
		//double tint=0;//BigDecimal.doubleValue(tint1);
		if(mid!=0 || tid==r)
		{
		if(mstr=="credit")
		{
			y=bal[mid-3]-mamt;
		}else
		{
			y=bal[mid-3]+mamt;
		}
		}
		for(int i=0;i<r-2;i++)
			sum=sum+bal[i];
		float a1=36500/a;
		BigDecimal b1=BigDecimal.valueOf(a1);
		//x=((int)Math.round(((((tint*100*365)/a)-(y+sum)))));
		 x=(tint1.multiply(b1).subtract(BigDecimal.valueOf(y+sum))).setScale(0,RoundingMode.HALF_UP).intValue();
		
		 if(mid!=0 && mid!=3)
		 {
		if(bal[mid-4]<x)
		{
			System.out.println(mid-2+" "+(x-bal[mid-4])+" "+"credit"+" "+x);
		}else
		{
			System.out.println(mid-2+" "+(bal[mid-4]-x)+" "+"debit"+" "+x);
		}
		 
		if(x<y)
		{
			System.out.println(mid-1+" "+(y-x)+" "+"credit"+" "+y);
		}else
		{
			System.out.println(mid-1+" "+(x-y)+" "+"debit"+" "+y);
		}
		 }else
		 {
			 System.out.println(1+" "+x+" "+"credit"+" "+x);
			 if(x<y)
				{
					System.out.println(2+" "+(y-x)+" "+"credit"+" "+y);
				}else
				{
					System.out.println(2+" "+(x-y)+" "+"debit"+" "+y);
				}
		 }
	}

}
