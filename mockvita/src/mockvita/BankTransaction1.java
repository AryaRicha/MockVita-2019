package mockvita;
	//This is The Coding Area
	import java.util.*;
	import java.lang.*;
	import java.math.*;
	public class BankTransaction1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      int preid=0,mid=0,tid=0,r=0;
	       BigDecimal a=null,mamt=null,x=null,y=null,tint=null,amount=null,prebal=null,bal=null,mbal=null,mpbal=null;
	       BigDecimal sum=new BigDecimal("0.0");
			Scanner s=new Scanner(System.in);
	     	if(s.hasNextDouble())
			a=new BigDecimal(String.valueOf(s.nextDouble()));;
	      	if(s.hasNextInt())
			 r=s.nextInt();
	      	s.nextLine();
			
			String mstr=null;
			//BigDecimal bal[]=new BigDecimal[r-2];
	      if(r>5 && r<365)
	      {
	        
			for(int i=0;i<r-2;i++)
			{
	          String str1=null;
	          
	         	if(s.hasNextLine())
				str1=s.nextLine();
	         	//System.out.println(str1);
				String str2[]=str1.split(" ");
			 	tid=Integer.parseInt(str2[0]);
	         // if(Integer.parseInt(str2[1])>=0 && Integer.parseInt(str2[1])<=1000)
				amount=new BigDecimal(String.valueOf(str2[1]));
				String str=str2[2];
				prebal=bal;
				
				bal=BigDecimal.valueOf(Double.parseDouble(str2[3]));
				sum=sum.add(bal);
				//bal[i]=BigDecimal.valueOf(Double.parseDouble(str2[3]));
				//System.out.println(bal[i]);
				if(tid!=preid+1)
				{
					mid=tid;
					mamt=amount;
					mstr=str;
					mpbal=prebal;
					mbal=bal;
					
				}
				preid=tid;
				
			}
	      }
	     BigDecimal tint1=null;
	     if(s.hasNextBigDecimal())
	     // if(s.hasNextDouble())
	       // tint=s.nextDouble();
		tint1=new BigDecimal(String.valueOf(s.nextDouble()));
	       // tint1=s.nextBigDecimal();
			if(mid!=0 || tid==r)
	        {
			if(mstr=="credit")
			{
				y=mbal.subtract(mamt);
			}else
			{
				y=mbal.add(mamt);
			}
	        }
	      
			//for(int i=0;i<r-2;i++)
			//{
				//System.out.println(bal[i]);
				//sum=sum.add(bal[i]);
				//System.out.println(sum);
			//}
			//x=Math.round(((tint*100*365)/a)-(y+sum));
	      //float a1=36500/a;
	     // BigDecimal b1=BigDecimal.valueOf(a1);
			//x=((int)Math.round(((((tint*100*365)/a)-(y+sum)))));
			//x=(tint1.multiply(b1).subtract(BigDecimal.valueOf(y+sum))).setScale(0,RoundingMode.HALF_UP).intValue();
			x=tint1.multiply(BigDecimal.valueOf(36500)).divide(a).subtract(y.add(sum));
		if(mid>=4)
	      {
			if(mpbal.compareTo(x)<0)
			{
				System.out.println(mid-2+" "+x.subtract(mpbal).setScale(0, RoundingMode.HALF_UP)+" "+"credit"+" "+x.setScale(0, RoundingMode.HALF_UP));
			}else
			{
				System.out.println(mid-2+" "+(mpbal.subtract(x)).setScale(0, RoundingMode.HALF_UP)+" "+"debit"+" "+x.setScale(0, RoundingMode.HALF_UP));
			}
			if(x.compareTo(y)<0)
			{
				System.out.println(mid-1+" "+(y.subtract(x)).setScale(0, RoundingMode.HALF_UP)+" "+"credit"+" "+y.setScale(0, RoundingMode.HALF_UP));
			}else
			{
				System.out.println(mid-1+" "+(x.subtract(y)).setScale(0, RoundingMode.HALF_UP)+" "+"debit"+" "+y.setScale(0, RoundingMode.HALF_UP));
			}
	      }
	      else
	        	{
	          System.out.println(1+" "+x.setScale(0, RoundingMode.HALF_UP)+" "+"credit"+" "+x.setScale(0, RoundingMode.HALF_UP));
	        if(x.compareTo(y)<0)
			{
				System.out.println(2+" "+(y.subtract(x)).setScale(0, RoundingMode.HALF_UP)+" "+"credit"+" "+y.setScale(0, RoundingMode.HALF_UP));
			}else
			{
				System.out.println(2+" "+(x.subtract(y)).setScale(0, RoundingMode.HALF_UP)+" "+"debit"+" "+y.setScale(0, RoundingMode.HALF_UP));
			}
	        	}
	        
		}

	}



