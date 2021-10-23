package mockvita;
import java.util.*;
import java.lang.*;
public class SortSpell {
	static String convert_to_words(char[] num) 
	{ 
	    // Get number of digits 
	    // in given number 
	    int len = num.length;  
	    String res="";
	    /* The first string is not used, it is to make  
	        array indexing simple */
	    String[] single_digits = new String[]{ "zero", "one",  
	                                        "two", "three", "four", 
	                                        "five", "six", "seven",  
	                                            "eight", "nine"}; 
	  
	    /* The first string is not used, it is to make  
	        array indexing simple */
	    String[] two_digits = new String[]{"", "ten", "eleven", "twelve",  
	                                        "thirteen", "fourteen", 
	                                        "fifteen", "sixteen", "seventeen", 
	                                        "eighteen", "nineteen"}; 
	    /* The first two string are not used, they are to make array indexing simple*/
	    String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty",  
	                                            "fifty","sixty", "seventy",  
	                                            "eighty", "ninety"}; 
	  
	    String[] tens_power = new String[] {"hundred", "thousand"}; 
	  
	    /* Used for debugging purpose only */
	    //System.out.print(String.valueOf(num)+": "); 
	  
	    /* For single digit number */
	    if (len == 1)  
	    { 
	        //System.out.println(single_digits[num[0] - '0']); 
	        return single_digits[num[0] - '0']; 
	    } 
	  
	    /* Iterate while num 
	        is not '\0' */
	    int x = 0; 
	    while (x < num.length)  
	    { 
	  
	        /* Code path for first 2 digits */
	    	 if (len >= 3) 
	         { 
	             if (num[x]-'0' != 0) 
	             { 
	                 res=single_digits[num[x] - '0']+" "; 
	                 res=res+tens_power[len - 3]+" ";  
	                 // here len can be 3 or 4 
	             } 
	             --len; 
	         } 
	   
	         /* Code path for last 2 digits */
	         else
	         { 
	             /* Need to explicitly handle  
	             10-19. Sum of the two digits 
	             is used as index of "two_digits" 
	             array of strings */
	             if (num[x] - '0' == 1)  
	             { 
	               int sum = num[x] - '0' +  
	                   num[x+1] - '0'; 
	                return res=res+two_digits[sum]; 
	                 
	             } 
	   
	             /* Need to explicitely handle 20 */
	             else if (num[x] - '0' == 2 &&  
	                     num[x + 1] - '0' == 0) 
	             { 
	                 //System.out.println("twenty"); 
	                 return res=res+"twenty"; 
	             } 
	   
	             /* Rest of the two digit  
	             numbers i.e., 21 to 99 */
	             else
	             { 
	                 int i = (num[x] - '0'); 
	                 if(i > 0) 
	                 res=res+tens_multiple[i]+" "; 
	                 else
	                 res=res+""; 
	                 ++x; 
	                 if (num[x] - '0' != 0) 
	                     res=res+single_digits[num[x] - '0']; 
	             } 
	         } 
	         ++x; 
	     } 
	    return res;
	 }
	static long convert_to_no(String str3)
	{
	 boolean isValidInput = true;
	    long result = 0;
	    long finalResult = 0;
	    List<String> allowedStrings = Arrays.asList
	    (
	    "zero","one","two","three","four","five","six","seven",
	    "eight","nine","ten","eleven","twelve","thirteen","fourteen",
	    "fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
	    "thirty","forty","fifty","sixty","seventy","eighty","ninety",
	    "hundred","thousand","million","billion","trillion"
	    );

	   // String input="One hundred two thousand and thirty four";

	    if(str3 != null && str3.length()> 0)
	    {
	        str3 = str3.replaceAll("-", " ");
	        str3 = str3.toLowerCase().replaceAll(" and", " ");
	        String[] splittedParts = str3.trim().split("\\s+");

	        for(String str : splittedParts)
	        {
	            if(!allowedStrings.contains(str))
	            {
	                isValidInput = false;
	                System.out.println("Invalid word found : "+str);
	                break;
	            }
	        }
	        if(isValidInput)
	        {
	            for(String str : splittedParts)
	            {
	                if(str.equalsIgnoreCase("zero")) {
	                	 result += 0;
	                }
	                else if(str.equalsIgnoreCase("one")) {
	                    result += 1;
	                }
	                else if(str.equalsIgnoreCase("two")) {
	                    result += 2;
	                }
	                else if(str.equalsIgnoreCase("three")) {
	                    result += 3;
	                }
	                else if(str.equalsIgnoreCase("four")) {
	                    result += 4;
	                }
	                else if(str.equalsIgnoreCase("five")) {
	                    result += 5;
	                }
	                else if(str.equalsIgnoreCase("six")) {
	                    result += 6;
	                }
	                else if(str.equalsIgnoreCase("seven")) {
	                    result += 7;
	                }
	                else if(str.equalsIgnoreCase("eight")) {
	                    result += 8;
	                }
	                else if(str.equalsIgnoreCase("nine")) {
	                    result += 9;
	                }
	                else if(str.equalsIgnoreCase("ten")) {
	                    result += 10;
	                }
	                else if(str.equalsIgnoreCase("eleven")) {
	                    result += 11;
	                }
	                else if(str.equalsIgnoreCase("twelve")) {
	                    result += 12;
	                }
	                else if(str.equalsIgnoreCase("thirteen")) {
	                    result += 13;
	                }
	                else if(str.equalsIgnoreCase("fourteen")) {
	                    result += 14;
	                }
	                else if(str.equalsIgnoreCase("fifteen")) {
	                    result += 15;
	                }
	                else if(str.equalsIgnoreCase("sixteen")) {
	                    result += 16;
	                }
	                else if(str.equalsIgnoreCase("seventeen")) {
	                    result += 17;
	                }
	                else if(str.equalsIgnoreCase("eighteen")) {
	                    result += 18;
	                }
	                else if(str.equalsIgnoreCase("nineteen")) {
	                    result += 19;
	                }
	                else if(str.equalsIgnoreCase("twenty")) {
	                    result += 20;
	                }
	                else if(str.equalsIgnoreCase("thirty")) {
	                    result += 30;
	                }
	                else if(str.equalsIgnoreCase("forty")) {
	                    result += 40;
	                }
	                    else if(str.equalsIgnoreCase("fifty")) {
	                        result += 50;
	                    }
	                    else if(str.equalsIgnoreCase("sixty")) {
	                        result += 60;
	                    }
	                    else if(str.equalsIgnoreCase("seventy")) {
	                        result += 70;
	                    }
	                    else if(str.equalsIgnoreCase("eighty")) {
	                        result += 80;
	                    }
	                    else if(str.equalsIgnoreCase("ninety")) {
	                        result += 90;
	                    }
	                    else if(str.equalsIgnoreCase("hundred")) {
	                        result *= 100;
	                    }
	                    else if(str.equalsIgnoreCase("thousand")) {
	                        result *= 1000;
	                        finalResult += result;
	                        result=0;
	                    }
	                    else if(str.equalsIgnoreCase("million")) {
	                        result *= 1000000;
	                        finalResult += result;
	                        result=0;
	                    }
	                    else if(str.equalsIgnoreCase("billion")) {
	                        result *= 1000000000;
	                        finalResult += result;
	                        result=0;
	                    }
	                        else if(str.equalsIgnoreCase("trillion")) {
	                            result *= 1000000000000L;
	                            finalResult += result;
	                            result=0;
	                        }
	                    }

	                    finalResult += result;
	                    result=0;
	                    
	                }
	            }
	    return finalResult;
	                }
	static long work(String sp)
	{
		String [] st=sp.split(" ");
		long a=Long.parseLong(st[0]);
		long b=Long.parseLong(st[1]);
		if(a==b)
			return a;
		String a1=convert_to_words(st[0].toCharArray());
		//System.out.println(st[0]+":"+a1);
		String b1=convert_to_words(st[1].toCharArray());
		String str2[]= {a1,b1};
		Arrays.sort(str2);
		//System.out.println(str2[0]+" "+str2[1]);
		//System.out.println(convert_to_no(str2[0]));
		long c=convert_to_no(str2[0]);
		long d=convert_to_no(str2[1]);
		long e=c+a;
		long f=b+d;
		if(e!=f)	
			return work(e+" "+f);
		else
		return e;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		System.out.println(work(str));
		
		
		
		
		

	}
}