package mockvita;
import java.util.*;
import java.lang.*;
public class BrideHunting {
	public static int checkquality(int i,int j,int a[][])
	{
		int res=0;
		if( i>=0 && j>=0 && i<a.length && j<a[0].length)
			if(a[i][j]==1)
				res++;
			
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		int res=0,pres=0,pi=1000,pj=1000;
		String value=null;
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				res=0;
				if(i!=0 || j!=0)
				{
				if(a[i][j]==1)
				{
					res=checkquality(i,j+1,a)+checkquality(i,j-1,a)+checkquality(i+1,j,a)+checkquality(i-1,j,a)+
					checkquality(i+1,j+1,a)+checkquality(i+1,j-1,a)+checkquality(i-1,j+1,a)+checkquality(i-1,j-1,a);
				}
				if(res!=0)
				{
					//hm.put(res,i+","+j);
					if(res>pres)
					{
						pres=res;
						pi=i;
						pj=j;
						
					}
					else if(res==pres && (i<pi || j<pj) )
					{
						pres=res;
						pi=i;
						pj=j;
					}
				}
				}
				//System.out.println(res);
			
			}
		}
		pj=pj+1;
		System.out.println(pi+1+":"+pj+":"+pres);

	}

}
