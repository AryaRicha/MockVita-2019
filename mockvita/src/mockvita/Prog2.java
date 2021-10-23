package mockvita;
import java.lang.*;
import java.util.*;
public class Prog2 {
	 public static int fact(int n)
	    {
	        int fact=1, i;
	        for(i=1; i<=n; i++)
	        {
	            fact = fact*i;
	        }
	        return fact;
	    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int res1=0,res2=0;
		int x=sc.nextInt();
		int s=sc.nextInt();
		int y=sc.nextInt();
		int m=sc.nextInt();
		int z=sc.nextInt();
		int c=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		char a[]=str.replaceAll("\\s","").toCharArray();
		String str1=sc.nextLine();
		char a1[]=str1.replaceAll("\\s","").toCharArray();
		res1=fact(x)/(fact(s)*fact(x-s))*fact(y)/(fact(y-m)*fact(m))*fact(z)/(fact(z-c)*fact(c));
		int xl=0,xm=x-1,yl=x,ym=x+y-1,zl=ym,zm=ym+z-1;
		int gx=0,gy=0,gz=0;
		if(a1[0]-'A'>=xl && a1[0]-'A'<=xm)
		{
			gx++;
			x=x-1;
		}
		else if(a1[0]-'A'>=yl && a1[0]-'A'<=ym)
		{
			gy++;
			y=y-1;
		}
		else 
		{
			gz++;
			z=z-1;
		}
		//remove a
		int res21=0,res22=0,px=0,py=0,pz=0,res23=0;
		
		if(a[0]-'A'>=xl && a[0]-'A'<=xm)
		{
			px++;
			x=x-1;
		}
		else if(a[0]-'A'>=yl && a[0]-'A'<=ym)
		{
			py++;
			y=y-1;
		}
		else if(a[0]-'A'>=zl && a[0]-'A'<=zm)
		{
			pz++;
			z=z-1;
		}
		if(x>=s && y>=m && z>=c)
		{
			res21=(fact(x)/(fact(s)*fact(x-s)))*(fact(y)/(fact(y-m)*fact(m)))*(fact(z)/(fact(z-c)*fact(c)));
		}
		if(a[1]-'A'>=xl && a[1]-'A'<=xm)
			x=x-1;
		else if(a[1]-'A'>=yl && a[1]-'A'<=ym)
			y=y-1;
		else if(a[1]-'A'>=zl && a[1]-'A'<=zm)
			z=z-1;
		if(x>=s && y>=m && z>=c)
		{
			res22=(fact(x)/(fact(s)*fact(x-s)))*(fact(y)/(fact(y-m)*fact(m)))*(fact(z)/(fact(z-c)*fact(c)));
		}
		if(px==1)
			x++;
		else if(py==1)
			y++;
		else if(pz==1)
			z++;
		if(x>=s && y>=m && z>=c)
		res23=(fact(x)/(fact(s)*fact(x-s)))*(fact(y)/(fact(y-m)*fact(m)))*(fact(z)/(fact(z-c)*fact(c)));
		int l=0;
		if(gx==1)
		{
			if(x+1>=s)
				l++;
		}
		else if(gy==1)
		{
			if(y+1>=m)
				l++;
		}
		else if(gz==1)
		{
			if(z+1>=c)
				l++;
		}
		res2=res21+res23-res22;
		if(l==1)
			res2=res2+1;
		System.out.println(res1+"\n"+res2);
				
	}

}
