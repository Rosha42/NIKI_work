import java.util.*;
class Niki
{
	static long countStrings(long n)
	{
	        HashMap<Long,Long> map = new HashMap<Long,Long>();
	        HashMap<Long,Long> map1 = new HashMap<Long,Long>();
		map.put((long)0,(long)1);
		map1.put((long)0,(long)1);
		for (long i = 1; i < n; i++)
		{
			map.put(i ,(long)map.get(i-1)+ (long)map1.get(i-1));
			map1.put(i,(long)map.get(i-1));
			if((long)map.get(i)>(1000000007))
			   map.put(i,((long)map.get(i))%(1000000007));
			if((long)map1.get(i)>(1000000007))
			   map1.put(i,((long)map1.get(i))%(1000000007));    
			    
		}
		return (((long)map.get(n-1)+(long)map1.get(n-1))%(1000000007));
	}
	/* main program to test above function */
	public static void main (String args[])
	{
	   Scanner rosha=new Scanner(System.in);
	   System.out.println("Enter no of test cases");
	   int t = rosha.nextInt();
	   if(t<1 || t>1000)
		 return;
	   long result[]=new long[t];
	   for (int i =0;i<t;i++ )
	   {
	    System.out.println("Please enter length of string");
	    long l1 = rosha.nextLong();
		if(l1<1 || l1> 1000000000000000l)
			return;
		result[i]=countStrings(l1);
	   }
	   for (int i =0;i<t;i++ )
	   {
	    System.out.println(result[i]);
	   }
	}
}
