public class ExceptionExample
{
	public void show()
	{
		String a="iam error";
		System.out.println(a);
		try
		{
			int i=50/1;//ArithmeticException
			System.out.println(i);
			
			String a1="hii";//NullpointerException
			System.out.println(a1.length());
			
		int	arr[]=new int[3];
		arr[4]=34;//ArrayIndexOutOfBoundsException
			
			int m=Integer.parseInt(a1);//NumberFormatException
			System.out.println(m);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		String b="i cannot be handle";
		System.out.println(b);
	}

	public static void main(String[] args)
	{
		ExceptionExample ep=new ExceptionExample();
		ep.show();
		

	}

}