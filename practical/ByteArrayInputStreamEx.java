import java.io.ByteArrayInputStream;
public class ByteArrayInputStreamEx
{

	public static void main(String[] args) 
	{
		byte Arr[]= {56,34,66,35,42};
		ByteArrayInputStream bin=new ByteArrayInputStream(Arr);
		int i=0;
		while((i=bin.read())!=-1)
		{
			char ch=(char)i;
			System.out.println("ASCII character"+ i +"value is"+ch);
		}

	}

}