public class autoboxing_unboxing
{
	public static void main(String[] args)
	{
		long startTime,endtime;
		startTime = System.currentTimeMillis();
		Integer i=0;
	    while(i<100000000)
		{
			i++;
		}
		endtime= System.currentTimeMillis();
		System.out.println(endtime-startTime);
		startTime=System.currentTimeMillis();
		int ii=0;
		while(ii<100000000)
		{
			ii++;
		}
		endtime= System.currentTimeMillis();
		System.out.println(endtime-startTime);
	}
}
