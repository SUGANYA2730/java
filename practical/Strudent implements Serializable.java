import java.io.Serializable;


public class Strudent implements Serializable
{
 int id;
 String name;
 transient int fees;
 
 public Strudent(int id,String name,int fees)
 {
	 this.id=id;
	 this.name=name;
	 this.fees=fees;
	 
 }
 
}