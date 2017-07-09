public class string_same_length
{
	public static void main(String[] args)
	{
		long startTime,endtime;
		startTime = System.currentTimeMillis();
		String a="abc";
		String b="def";
		for(int i=0;i<1000000;i++)
		{
			if(a.equalsIgnoreCase(b))
			{

			}
		}
	    endtime= System.currentTimeMillis();
		System.out.println(endtime-startTime);
		startTime=System.currentTimeMillis();
		String c="abc";
		String d="def";
		for(int i=0;i<1000000;i++)
		{
			if(c.equals(d))
			{

			}
		}
		endtime= System.currentTimeMillis();
		System.out.println(endtime-startTime);
	}
}
