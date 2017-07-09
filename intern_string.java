public class intern_string
{
	public static void main(String[] args)
	{
		long startTime,endtime;
		startTime = System.currentTimeMillis();
		String a=new String("abc").intern();
		String b=new String("abc").intern();
		for(int i=0;i<1000000;i++)
		{
			if(a.equals(b))
			{

			}
		}
	    endtime= System.currentTimeMillis();
		System.out.println(endtime-startTime);
		startTime=System.currentTimeMillis();
		String c=new String("abc").intern();
		String d=new String("abc").intern();
		for(int i=0;i<1000000;i++)
		{
			if(c == d)
			{

			}
		}
		endtime= System.currentTimeMillis();
		System.out.println(endtime-startTime);
	}
}
