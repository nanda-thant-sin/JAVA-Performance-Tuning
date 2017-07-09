public class string_comparison
{
	public static void main(String[] args)
	{
		long startTime,endtime;
		startTime = System.currentTimeMillis();
		String name="abc";
		for(int i=0;i<100000000;i++)
		{
			if(name!=null && name.equals(""))
				{
				
			}
		}
	    endtime= System.currentTimeMillis();
		System.out.println(endtime-startTime);
		startTime=System.currentTimeMillis();
		String name2="abc";
		for(int i=0;i<100000000;i++)
		{
			if(name2!=null && name2.length()==0)
			{

			}
		}
		endtime= System.currentTimeMillis();
		System.out.println(endtime-startTime);
	}
}
