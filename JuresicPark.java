package mockvita;
import java.util.*;
import java.lang.*;
public class JuresicPark {
	static String p[][];
	static int g[],c1,c2;
	static int m,n;
	public static int checkbound(int i,int j) {
		int res=0;
		if(i>=0 && i<m && j>=0 && j<n)
		{
			if(p[i][j].equals("W"))
				res=1;
		}
		return res;
	}
	public static boolean checkgate(int x,int y)
	{
		boolean flag=false;
		for(int i=0;i<5;i=i+2)
		{
			if(g[i]==x && g[i+1]==y)
				flag=true;
		}
		return flag;
	}
	public static int checkmwc(int x,int y)
	{
		int flag=0;
		
		if(x>=0 && x<m && y>=0 && y<n)
		{
			if((x==c1 && y==c2 )|| p[x][y].equals("M") || p[x][y].equals("W"))
				flag=1;
		}
		
		return flag;
	}
	public static int check(int l,int i,int j)
	{
		int all=0;
		if((i==0 &&j==0) || (i==m-1 &&j==n-1) ||(i==0 && j==n-1) ||(j==0 && i==m-1))
		{
				if(l==2)
						all++;
				
		}
		else if(i==0 || j==0 || i==m-1 || j==n-1)
		{
				if(l==3)
					all++;
		}
		else
		{
				if(l==4)
					all++;
				
		}
		return all;
	}
	public static boolean checksafe(int x,int y)
	{
		boolean dis=false;
		 //dis=Math.min(Math.min(Math.abs(g[0]-x),Math.abs(g[2]-x)),Math.abs(g[4]-x))+Math.min(Math.min(Math.abs(g[1]-y),Math.abs(g[3]-y)),Math.abs(g[5]-y));
		if(x==c1 && y==c2)
			return dis;
		int res =checkmwc(x,y+1)+checkmwc(x,y-1)+checkmwc(x+1,y)+checkmwc(x-1,y);
		int l=checkbound(x,y+1)+checkbound(x,y-1)+checkbound(x+1,y)+checkbound(x-1,y);
		if(l==0 || res!=l )
		{
		if(check(res,x,y)==0)
		{
		 if((Math.abs(g[0]-x)+Math.abs(g[1]-y))>(Math.abs(g[0]-c1)+Math.abs(g[1]-c2)))
			dis=true;
		 else if((Math.abs(g[2]-x)+Math.abs(g[3]-y))>(Math.abs(g[2]-c1)+Math.abs(g[3]-c2)))
				dis=true;
		 else if((Math.abs(g[4]-x)+Math.abs(g[5]-y))>(Math.abs(g[4]-c1)+Math.abs(g[5]-c2)))
				dis=true;
		}
		}
		return dis;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=0,safe=0,unsafe=0,k=0;
		Scanner s=new Scanner(System.in);
		String rc=s.nextLine();
		String rc1[]=rc.split(" ");
		m=Integer.parseInt(rc1[0]);
		 n=Integer.parseInt(rc1[1]);
		String str1=s.nextLine();
		String str2[]=str1.split(" ");
		g=new int[6];
		for(int i=0;i<str2.length-2;i++)
		{
			g[i]=Integer.parseInt(str2[i])-1;
		}
		c1=Integer.parseInt(str2[6])-1;
		c2=Integer.parseInt(str2[7])-1;
		
		p=new String[m][n];
		for(int i=0;i<m;i++)
		{
			String str=s.nextLine();
			//System.out.println(str);
			StringTokenizer st=new StringTokenizer(str," ");
			for(int j=0;j<n;j++)
			{
			if(st.hasMoreTokens())
			p[i][j]=st.nextToken();
			}
			
		}
		System.out.println(m+" "+n);
		for (int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(p[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{ k=0;
				if(p[i][j]=="G");
				{
					if(checkgate(i,j))
					{
						safe++;
						k=1;
						System.out.println("gatesafe"+safe);
					}
					else
					{
							l=checkbound(i,j+1)+checkbound(i,j-1)+checkbound(i+1,j)+checkbound(i-1,j);
							if(check(l,i,j)==1)
							{
								safe++;
							k=1;
							System.out.println("boundsafe"+safe);
							}
					}
					
				
				
				if(k==0)
				if(checksafe(i,j))
				{
					safe++;
					System.out.println("Checksafe"+safe);
				}
				}
					
			}
		}
		System.out.println(safe);
		

	}

}
