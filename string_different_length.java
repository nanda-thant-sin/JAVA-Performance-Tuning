public class string_different_length
{
	public static void main(String[] args)
	{
		long startTime,endtime;
		startTime = System.currentTimeMillis();
		String a="abc";
		String b="defg";
		for(int i=0;i<100000000;i++)
		{
			if(a.equalsIgnoreCase(b))
			{

			}
		}
	    endtime= System.currentTimeMillis();
		System.out.println(endtime-startTime);
		startTime=System.currentTimeMillis();
		String c="abc";
		String d="defg";
		for(int i=0;i<100000000;i++)
		{
			if(c.equals(d))
			{

			}
		}
		endtime= System.currentTimeMillis();
		System.out.println(endtime-startTime);
	}
}
