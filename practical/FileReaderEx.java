import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try
{
		FileReader fr=new FileReader("D:\\test1.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
	    }
		fr.close();
		
	}
	catch(Exception e) {
		System.out.println(e);
	}

}
}