package mockvita;
import java.util.*;
import java.util.Scanner;

public class ConsecutivePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0,p=2,k=0;
		ArrayList<Integer> prime=new ArrayList<Integer>();
		//prime.add(2);
		for(int i=3;i<=n;i++)
		{
			k=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					k++;
					break;
				}
			}
			if(k==0)
				prime.add(i);
		}
		//System.out.print(prime);
		int sum=2,prex=0;
		for(int i=5;i<=n;i++)
		{
			int j=prime.indexOf(i);
			//System.out.println(j);
			if(j>=0)
			{
				sum=2;
			for(int x=0;x<j;x++)
			{
				sum=sum+prime.get(x);
				//prex=x;
			}
			//System.out.println(sum);
			//System.out.print(sum);
			if(prime.contains(sum))
				count++;
			}
			
		}
		System.out.println(count);

	}

}
