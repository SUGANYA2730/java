package lab_coding;
import java.util.ArrayList;
public class ArraylistEmptyOrNotEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(10);
		   boolean ans = arr.isEmpty();
		        if (ans == true)
		            System.out.println("The ArrayList is empty");
		        else
		            System.out.println("The ArrayList is not empty");
		  
		       arr.add(1);
              ans = arr.isEmpty();
		        if (ans == true)
		            System.out.println("The ArrayList is empty");
		        else
		            System.out.println("The ArrayList is not empty");
		    }
	
}