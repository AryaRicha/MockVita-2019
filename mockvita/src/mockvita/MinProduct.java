package mockvita;

import java.util.Arrays;
import java.util.Scanner;

public class MinProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] str1=str.split(" ");
		int n=Integer.parseInt(str1[0]);
		int k=Integer.parseInt(str1[1]);
		Integer a[]=new Integer[n];
		Integer b[]=new Integer[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=0;i<n;i++)
			b[i]=s.nextInt();
		
		int product=0,temp=0;
		Integer sum[]=new Integer[n];
		for(int i=0;i<n;i++)
			sum[i]=0;
		for(int i=0;i<n;i++)
		{
				product=a[i]*b[i];	
				if(product<0 && a[i]<0)
					temp=(a[i]-2*k)*b[i];
				else if(product<0 && a[i]>0)
					temp=(a[i]+2*k)*b[i];
				else if(product>0 && a[i]<0)
					temp=(a[i]+2*k)*b[i];
				else if(product>0 && a[i]>0)
					temp=(a[i]-2*k)*b[i];
				for(int j=0;j<n;j++)
				{
					if(j!=i)
					{
						sum[i]=sum[i]+b[j]*a[j];
					}
					
				}
				sum[i]=sum[i]+temp;
		}
		Arrays.sort(sum);
		System.out.println(sum[0]);
		
		
		

	}

}
