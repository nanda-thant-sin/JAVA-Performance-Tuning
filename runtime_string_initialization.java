public class runtime_string_initialization
{
	public static void main(String[] args)
	{
		long startTime,endtime;
		startTime = System.currentTimeMillis();
		String name="abc";
		for(int i=0;i<100000000;i++)
		{
			String x= "Hello";
			x+=",";
			x+="Mr.";
			x+=name;
		}
		endtime= System.currentTimeMillis();
		System.out.println(endtime-startTime);
		startTime=System.currentTimeMillis();
		String name2="abc";
		for(int i=0;i<100000000;i++)
		{
			String x= (new StringBuffer()).append("Hello").append(",").append("Mr.").append(name2).toString();
		}
		endtime= System.currentTimeMillis();
		System.out.println(endtime-startTime);
	}
}
