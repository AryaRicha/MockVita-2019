package mockvita;
import java.util.*;
import java.lang.*;

public class Rotation {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int q=Integer.parseInt(s.nextLine());
		//Character c[]=new Character[q];
		//Integer a[]=new Integer[q];
		String firstchar="";
		
		for(int i=0;i<q;i++)
		{
			String str3="";
			String str1=s.nextLine();
			String str2[]=str1.split(" ");
			if(str2[0].equals("L"))
			{
				str3=str3.concat(str.substring(Integer.parseInt(str2[1]))+str.substring(0,Integer.parseInt(str2[1])));
				firstchar=firstchar+(str3.charAt(0));
			}else
			{
				str3=str3.concat(str.substring(str.length()-Integer.parseInt(str2[1]))+str.substring(0,str.length()-Integer.parseInt(str2[1])));
				firstchar=firstchar+(str3.charAt(0));
			}
		}
		//System.out.println(firstchar);
		String str5="";
		for (int i = 0; i < str.length(); i++) {
			   //for (int j = i+3; j <= str.length(); j++) {
					if(i+3<=str.length())
			         str5=str5+" "+(str.substring(i,i+3));
			   //}
		}
		//System.out.println(str5);
		String[] str6=str5.split(" ");
		int k=0;
		 char firstchar1[]=firstchar.toCharArray();
		 char safe[]=firstchar.toCharArray();

		
		for(int i=0;i<str6.length;i++)
		{
			for(int l=0;l<str6[i].length();l++ )
			{
				for(int j=0;j<firstchar.length();j++)
				{
					if(str6[i].charAt(l)==firstchar1[j])
					{
						firstchar1[j]='0';
						k++;
						break;
					}
				}
				if(k==firstchar.length())
					break;
				else
				{
					for(int x=0;x<safe.length;x++)
						firstchar1[x]=safe[x];
					k=0;
				}
				
					
			}
		}
		if(k==firstchar1.length)
			System.out.println("yes");
		else
			System.out.println("No");
		
	}
	

}
