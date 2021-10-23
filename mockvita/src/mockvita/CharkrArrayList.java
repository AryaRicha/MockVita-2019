package mockvita;
import java.util.*;
import java.util.Scanner;

public class CharkrArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1=new ArrayList<Integer>(n);
		int row=0,col=0,endrow=0,endcol=0,count=1;
		int powerpoint=0,pp=0;
		powerpoint=1+(n*n)/11;
		//a.add(new ArrayList<Integer>());
		for(int i=0;i<n/2;i++)
		{
			row=col=i;
			endcol=n-i-1;
			endrow=n-i-1;
			for(col=i;col<endcol;col++)//top row
			{
				a1.add(col,count);
				a.add(row,a1);
				/*if(count%11==0)
				{
					powp[pp++]=row;
					powp[pp++]=col;
				}*/
				count++;
			}
			/*for(row=i;row<endrow;row++)//left col
			{
				a.get(row).add(col,count);
				a.add(row,a1);
				if(count%11==0)
				{
					powp[pp++]=row;
					powp[pp++]=col;
				}
				count++;
			}*/
			/*for(col=endcol;col>i;col--)
			{
				a.get(row).add(col,count);
				if(count%11==0)
				{
					powp[pp++]=row;
					powp[pp++]=col;
				}
				count++;
			}
			for(row=endrow;row>i;row--)
			{
				
				a.get(row).add(col,count);
				if(count%11==0)
				{
					powp[pp++]=row;
					powp[pp++]=col;
				}
				count++;
				
				
			}*/
		}
			if(n%2!=0)
			{
				a.get(row).add(col,count);	
			}
			System.out.println(a);

	}

}
