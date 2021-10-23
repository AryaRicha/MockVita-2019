package mockvita;
import java.util.*;
public class Chakarvyuh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[][]=new int[n][n];
		int row=0,col=0,endrow=0,endcol=0,count=1;
		int powerpoint=0,pp=0;
		powerpoint=1+(n*n)/11;
		int powp[]=new int[2*powerpoint];
		powp[pp++]=powp[pp++]=0;
		
		for(int i=0;i<n/2;i++)
		{
			row=col=i;
			endcol=n-i-1;
			endrow=n-i-1;
			for(col=i;col<endcol;col++)//top row
			{
				a[row][col]=count;
				if(count%11==0)
				{
					powp[pp++]=row;
					powp[pp++]=col;
				}
				count++;
			}
			for(row=i;row<endrow;row++)//left col
			{
				a[row][col]=count;
				if(count%11==0)
				{
					powp[pp++]=row;
					powp[pp++]=col;
				}
				count++;
			}
			for(col=endcol;col>i;col--)
			{
				a[row][col]=count;
				if(count%11==0)
				{
					powp[pp++]=row;
					powp[pp++]=col;
				}
				count++;
			}
			for(row=endrow;row>i;row--)
			{
				
				a[row][col]=count;
				if(count%11==0)
				{
					powp[pp++]=row;
					powp[pp++]=col;
				}
				count++;
			}
			
			
		}
		if(n%2!=0)
		{
			a[n/2][n/2]=n*n;
			if((n*n)%11==0)
			{
				powp[pp++]=n/2;
				powp[pp++]=n/2;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Total Power points :"+powerpoint);
		for(int i=0;i<powp.length;i=i+2)
			System.out.println("("+powp[i]+","+powp[i+1]+")");
		/*for(int i=0;i<powp.length;i++)
		System.out.print(powp[i]+" ");*/
		

	}

}
