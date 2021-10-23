package mockvita;
import java.lang.*;
import java.util.*;
class Month
{
	int res1;
	int m1=-1,m2=-1,m11=-1,m10=-1,m22=-1,m21=-1,m20=-1;
	 ArrayList month(ArrayList<Integer> a)
	{
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		 m11=Collections.binarySearch(a,1);
			if(m11>=0)
			{
				m1=1;
				a1.add(1);
				a.remove(m11);
				
				m22=Collections.binarySearch(a,2);
				m21=Collections.binarySearch(a,1);
				m20=Collections.binarySearch(a,0);
				if(m22>=0)
				{
					m2=2;
					a1.add(2);
					a.remove(m22);
				}
				else if(m21>=0)
				{
					m2=1;
					a1.add(1);
					a.remove(m21);
				
				}
				else if(m20>=0)
				{
					m2=0;
					a1.add(0);
					a.remove(m20);
				}
			}
			if(m1<0 || m2<0)
			{
				a.addAll(a1);
				a1.removeAll(a);
				Collections.sort(a);
				m10=Collections.binarySearch(a,0);
				if(m10>=0)
				{
				m1=0;
				a1.add(0);
				a.remove(m10);
				if(a.get(10)!=0)
				{
				m2=a.get(10);
				a1.add(m2);
				a.remove(10);
				}
				}
			}
			if(m1<0 || m2<0)
			{
				res1=0;
				a.addAll(a1);
				a1.removeAll(a);
				Collections.sort(a);
			}
			else
			{
				res1=m1*10+m2;
				//System.out.print(res1);
			}
			/*Iterator it=a.iterator();
			while(it.hasNext())
				System.out.println(it.next());*/
		return a;
	}
}
	class Date
	{
		int res2=0,d1=-1,d2=-1,d13=-1,d12=-1,d11=-1,d10=-1,d21=-1,d20=-1;
		 ArrayList date(ArrayList<Integer> a)
		{
			/*Iterator it=a.iterator();
			while(it.hasNext())
				System.out.println(it.next());*/
			 Month obj=new Month();
				
			ArrayList<Integer> a1=new ArrayList<Integer>();
			 
			 if(obj.res1!=2 )
			 {
				 d13=Collections.binarySearch(a,3);
			 }
				if(d13>=0)
				{
					d1=3;
					a1.add(3);
					a.remove(d13);
					if(obj.res1!=4 || obj.res1!=6 || obj.res1!=9 || obj.res1!=11)
					d21=Collections.binarySearch(a,1);
					d20=Collections.binarySearch(a,0);
					if(d21>=0)
					{
						d2=1;
						a1.add(1);
						a.remove(d21);
					}
					else if(d20>=0)
					{
						d2=0;
						a1.add(0);
						a.remove(d20);
					
					}
				}
				
				if(d1<0 || d2<0)
				{
					a.addAll(a1);
					a1.removeAll(a);
					Collections.sort(a);
					d12=Collections.binarySearch(a,2);
					d11=Collections.binarySearch(a,1);
					d10=Collections.binarySearch(a,0);

					if(d12>=0)
					{
					d1=2;
					a1.add(0);
					a.remove(d12);
					if(obj.res1!=2)
					{
					d2=a.get(8);
					a1.add(d2);
					a.remove(8);
					}else
					{ 
						int x=8;
						while(x>=0 && a.get(x)==9)
							x--;
						
						if(x>=0)
						{
							d2=a.get(x);
							a1.add(d2);
							a.remove(x);
						}
					}
					}
					else if(d11>=0)
					{
					d1=1;
					a1.add(1);
					a.remove(d11);
					d2=a.get(8);
					a1.add(d2);
					a.remove(8);
					}
					else if(d10>=0)
					{
					d1=0;
					a1.add(0);
					a.remove(d10);
					if(a.get(8)!=0)
					{
					d2=a.get(8);
					a1.add(d2);
					a.remove(8);
					}
					}
				}
					if(d1<0 || d2<0)
					{
						//System.out.print(d1+" "+d2);
						res2=0;
						a.addAll(a1);
						a1.removeAll(a);
						//Collections.sort(a);
						//System.out.println("haahaaaaa");
					}
					else
					{
						res2=d1*10+d2;
						//System.out.println(res2);
					}
			
			return a;
		}
	}
class Hour
{
	int res3=0, h1=-1,h2=-1,h11=-1,h12=-1,h10=-1,h20=-1,h21=-1,h22=-1,h23=-1,h24=-1;
	 ArrayList hour(ArrayList<Integer> a)
	 {
		 ArrayList<Integer> a1=new ArrayList<Integer>();
		 h12=Collections.binarySearch(a,2);
			if(h12>=0)
			{
				h1=2;
				a1.add(2);
				a.remove(h12);
				
				h20=Collections.binarySearch(a,0);
				h21=Collections.binarySearch(a,1);
				h22=Collections.binarySearch(a,2);
				h23=Collections.binarySearch(a,3);
			
				
				if(h23>=0)
				{
					h2=3;
					a1.add(3);
					a.remove(h23);
				
				}
				else if(h22>=0)
				{
					h2=2;
					a1.add(2);
					a.remove(h22);
				
				}
				else if(h21>=0)
				{
					h2=1;
					a1.add(1);
					a.remove(h21);
				}
				else if(h20>=0)
				{
					h2=0;
					a1.add(0);
					a.remove(h20);
				}
			}
			if(h1<0 || h2<0)
			{
				a.addAll(a1);
				a1.removeAll(a);
				Collections.sort(a);
				h11=Collections.binarySearch(a,1);
				h10=Collections.binarySearch(a,0);
				if(h11>=0)
				{
				h1=1;
				a1.add(1);
				a.remove(h11);
				h2=a.get(6);
				a1.add(h2);
				a.remove(6);
				}
				else if(h10>=0)
				{
					h1=0;
					a1.add(0);
					a.remove(h10);
					h2=a.get(6);
					a1.add(h2);
					a.remove(6);
				}
			}
			//System.out.print(h1+" "+h2);
			if(h1<0 || h2<0)
			{
				a.addAll(a1);
				a1.removeAll(a);
				Collections.sort(a);
				res3=0;
			}
			else if(h1==0 && h2==0)
				res3=1000;
			else
				res3=h1*10+h2;
			return a;
	 }
	
}
class Minutes
{
	int mi1=-1,mi2=-1,mi15=-1,mi14=-1,mi13=-1,mi12=-1,mi11=-1,mi10=-1,res4=0;
	ArrayList minutes(ArrayList<Integer> a)
	 {
		 ArrayList<Integer> a1=new ArrayList<Integer>();
		 
		 mi15=Collections.binarySearch(a,5);
			mi14=Collections.binarySearch(a,4);
			mi13=Collections.binarySearch(a,3);
			mi12=Collections.binarySearch(a,2);
			mi11=Collections.binarySearch(a,1);
			mi10=Collections.binarySearch(a,0);
			if(mi15>=0)
			{
				mi1=5;
				a1.add(5);
				a.remove(mi15);
			}
			else if(mi14>=0)
			{
				mi1=5;
				a1.add(4);
				a.remove(mi14);
			}
			else if(mi13>=0)
			{
				mi1=3;
				a1.add(3);
				a.remove(mi13);
			}
			else if(mi12>=0)
			{
				mi1=2;
				a1.add(2);
				a.remove(mi12);
			}
			else if(mi11>=0)
			{
				mi1=1;
				a1.add(1);
				a.remove(mi11);
			}
			else if(mi10>=0)
			{
				mi1=0;
				a1.add(0);
				a.remove(mi10);
			}
			mi2=a.get(4);
			if(mi1<0 || mi2<0)
				res4=0;
			else if(mi1==0 && mi2==0)
				res4=1000;
			else
				res4=mi1*10+mi2;
		 return a;
	 }
}
public class DateTime 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
				Scanner s=new Scanner(System.in);
				ArrayList<Integer> a=new ArrayList<Integer>();
				ArrayList<Integer> a1=new ArrayList<Integer>();
				String str=s.nextLine();
				StringTokenizer st=new StringTokenizer(str,",");
				while(st.hasMoreTokens())
				{
					a.add(Integer.parseInt(st.nextToken()));
				}
				Month obj1=new Month();
				obj1.month(a);
				Date obj2=new Date();
				obj2.date(a);
				int s1=0,s2=0;
				ArrayList<Integer> p=new ArrayList<Integer>();
				p.addAll(a);
				
				if(obj2.res2==0)
				{
					s1=obj1.m1;
					s2=obj1.m2;
					a.add(s1);
					obj1.month(a);
					a.add(s2);
					obj2.date(a);
					/*if(obj2.res2==0)
					{
						p.add(s2);
						a1.addAll(p);
						p.addAll(obj1.month(p));
						p.removeAll(a1);
						a1.addAll(p);
						p.addAll(obj2.date(p));
						p.removeAll(a1);
						a1.removeAll(a1);
						a1.addAll(a);
						a.addAll(p);
						a.removeAll(a1);
						a1.removeAll(a1);
					}*/
				}
				//System.out.println(obj2.res2);
				int s3=0,s4=0,s5=0,s6=0;
				Hour obj3=new Hour();
				Minutes obj4=new Minutes();
			if(obj2.res2>0)
			{
				
				obj3.hour(a);
				if(obj3.res3==0)
				{
					
				s3=obj2.d1;
				s4=obj2.d2;
				a.add(s3);
				obj2.date(a);
				a.add(s4);
				obj3.hour(a);
				}
				obj4.minutes(a);
				if(obj4.res4==0)
				{
					
				s5=obj3.h1;
				s6=obj3.h2;
				a.add(s5);
				obj3.hour(a);
				a.add(s6);
				obj4.minutes(a);
				}
			}
			
				//System.out.println(res4);
			String res11=null,res22=null,res33=null,res44=null;
			if(obj1.res1<=9)
			res11=0+""+obj1.res1;
			else 
				res11=obj1.res1+"";
			if(obj2.res2<=9)
				res22=0+""+obj2.res2;
			else
				res22=obj2.res2+"";
			if(obj3.res3<=9)
				res33=0+""+obj3.res3;
			else
				res33=obj3.res3+"";
			if(obj4.res4<=9)
				res44=0+""+obj4.res4;
			else
				res44=obj4.res4+"";
				
			if(obj1.res1==0|| obj2.res2==0 || obj3.res3==0 || obj4.res4==0)
				System.out.println(0);
			else
			{
				if(obj3.res3==1000 && obj4.res4!=1000)
					System.out.println(res11+""+"/"+res22+" "+"00"+":"+res44);
				else if(obj4.res4==1000 && obj3.res3!=1000)
					System.out.println(res11+""+"/"+res22+" "+res33+":"+"00");
				else if(obj4.res4==1000 && obj3.res3==1000)
					System.out.println(res11+""+"/"+res22+" "+"00"+":"+"00");
				else
				System.out.println(res11+""+"/"+res22+" "+res33+":"+res44);
			}
			
			}

		}

