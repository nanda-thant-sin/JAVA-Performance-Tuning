public class compile_time_initialization
{
	public static void main(String[] args)
	{
		long startTime,endtime;
		startTime = System.currentTimeMillis();
		for(int i=0;i<100000000;i++)
		{
			String x= "Hello"+","+" "+"World";
		}
		endtime= System.currentTimeMillis();
		System.out.println(endtime-startTime);
		startTime=System.currentTimeMillis();
		for(int i=0;i<100000000;i++)
		{
			String x= new String("Hello"+","+" "+"World");
		}
		endtime= System.currentTimeMillis();
		System.out.println(endtime-startTime);
	}
}
