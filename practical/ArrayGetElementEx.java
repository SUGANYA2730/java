package lab_coding;
import java.util.ArrayList;
public class ArrayGetElementEx {

	public static void main(String[] args) 
	{
		
		        ArrayList<Integer> arr = new ArrayList<Integer>(4);
		        arr.add(10);
		        arr.add(20);
		        arr.add(30);
		        arr.add(40);
		  
		      System.out.println("List: " + arr);
	          int element = arr.get(2);
		     System.out.println("the element at index 2 is "
		                           + element);
		    
		}
		
	}