package mockvita;
import java.lang.*;
import java.util.*;
public class Prog1 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int m1=-1,m2=-1,m11=-1,m10=-1,m22=-1,m21=-1,m20=-1;
		int res1=0,res2=0,res3=0,res4=0;
		int d1=-1,d2=-1,d13=-1,d12=-1,d11=-1,d10=-1,d21=-1,d20=-1;
		int h1=-1,h2=-1,h11=-1,h12=-1,h10=-1,h20=-1,h21=-1,h22=-1,h23=-1,h24=-1;
		int mi1=-1,mi2=-1,mi15=-1,mi14=-1,mi13=-1,mi12=-1,mi11=-1,mi10=-1;
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> a1=new ArrayList<Integer>();
		String str=s.nextLine();
		StringTokenizer st=new StringTokenizer(str,",");
		while(st.hasMoreTokens())
		{
			a.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(a);
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
			m2=a.get(10);
			a1.add(m2);
			a.remove(10);
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
			res1=m1*10+m2;
	//System.out.println(res1);	
		
	 d13=Collections.binarySearch(a,3);
		if(d13>=0)
		{
			d1=3;
			a1.add(3);
			a.remove(d13);
			
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
			if(res1!=2 || a.get(8)!=9)
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
			d2=a.get(8);
			a1.add(d2);
			a.remove(8);
			}
		}
			if(d1<0 || d2<0)
			{
				res2=0;
				a.addAll(a1);
				a1.removeAll(a);
				Collections.sort(a);
			}
			else
				res2=d1*10+d2;
		//System.out.println(res2);
			
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
				h10=Collections.binarySearch(a,2);
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
			if(h1<0 || h2<0)
			{
				a.addAll(a1);
				a1.removeAll(a);
				Collections.sort(a);
				res3=0;
			}
			else
				res3=h1*10+h2;
		//System.out.println(res3);
			
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
		else
			res4=mi1*10+mi2;
		//System.out.println(res4);
		
	if(res1==0|| res2==0 || res3==0 || res4==0)
		System.out.println(0);
	else
		System.out.println(res1+""+"/"+res2+" "+res3+":"+res4);
	
	}

}
