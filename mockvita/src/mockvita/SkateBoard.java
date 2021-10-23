package mockvita;
import java.util.*;
public class SkateBoard {
	static String a[][];
	static int count=0;
	static int cnt[];
	public static void counts(String str2,int i,int j)
	{
		
		i++;
		if(i<a.length)
		{
		String str1=a[i][j];
		if(str1.contains("S"))
			counts(str1,i,j);
		 if(str1.contains("N"))
			countn(str1,i,j);
		 if(str1.contains("E"))
			counte(str1,i,j);
		 if(str1.contains("W"))
			countw(str1,i,j);
		if(str1.contains("F"))
		{
			 if(cnt[count]==0)
			cnt[count]=cnt[count]+1;
		}
		
		 if(str1.contains("D"))
			return;
		}
		
	}
	public static void countn(String str2,int i,int j)
	{
		i--;
		if(i>=0)
		{
		 String str1=a[i][j];
		if(str1.contains("S"))
			counts(str1,i,j);
		 if(str1.contains("N"))
			countn(str1,i,j);
		 if(str1.contains("E"))
			counte(str1,i,j);
		 if(str1.contains("W"))
			countw(str1,i,j);
		if(str1.contains("F"))
		{
			 if(cnt[count]==0)
			cnt[count]=cnt[count]+1;
		 return;
		}
		if(str1.contains("D"))
			return;
		}
		
	}
	public static void counte(String str2,int i,int j)
	{
		j++;
		if(j<a.length)
		{
		 String str1=a[i][j];
		if(str1.contains("S"))
			counts(str1,i,j);
		if(str1.contains("N"))
			countn(str1,i,j);
		if(str1.contains("E"))
			counte(str1,i,j);
		if(str1.contains("W"))
			countw(str1,i,j);
		if(str1.contains("F"))
		{
			 if(cnt[count]==0)
			cnt[count]=cnt[count]+1;
			return;
		}
		 if(str1.contains("D"))
			 return;
		}
		
	}
	public static void countw( String str2,int i,int j)
	{
		j--;
		if(j>=0)
		{
		 String str1=a[i][j];
		if(a[i][j].contains("S"))
			counts(str1,i,j);
		if(a[i][j].contains("N"))
			countn(str1,i,j);
		if(a[i][j].contains("E"))
			counte(str1,i,j);
		if(a[i][j].contains("W"))
			countw(str1,i,j);
		 if(a[i][j].contains("F"))
		 {
			 //count++;
			 if(cnt[count]==0)
			 cnt[count]=cnt[count]+1;
			 return;
		 }
		if(str1.contains("D"))
			return;
		}
		
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		a=new String[n][n];
		for(int i=0;i<n;i++)
		{
			String str=s.nextLine();
			StringTokenizer st=new StringTokenizer(str,",");
			
			for(int j=0;j<n;j++)
			{
				if(st.hasMoreTokens())
					a[i][j]=st.nextToken();
			}
		}
		cnt=new int[2*n-1];
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++)
			
		{
			String str1=a[0][i];
			if(str1.contains("S"))
				counts(str1,0,i);
			
			if(str1.contains("N"))
				countn(str1,0,i);
			if(str1.contains("E"))
				counte(str1,0,i);
			if(str1.contains("W"))
				countw(str1,0,i);
			if(str1.contains("F")|| str1.contains("D"))
				break;
			count++;
			//System.out.println(count);
		}
		for(int i=1;i<n;i++)
			
		{
			String str1=a[i][0];
			if(str1.contains("S"))
				counts(str1,i,0);
			if(str1.contains("N"))
				countn(str1,i,0);
			if(str1.contains("E"))
				counte(str1,i,0);
			if(str1.contains("W"))
				countw(str1,i,0);
			if(str1.contains("F") || str1.contains("D"))
				break;
			count++;
			//System.out.println("2ndhaaaa"+count);
		}
		int res=0;
		//System.out.println(count);
		for (int i=0;i<2*n-1;i++)
		{
				//System.out.print(cnt[i]+" ");
			res=res+cnt[i];
		}
		System.out.println(res);
	}

}
