package java8eg;

public class MethodReferenceEg{

public void display(String a){
System.out.println("Hello..I am "+d);
}
public static void main(String[] args){
//TODO Auto-generated method stub
MethodReferenceEg m=new MethodReferenceEg();

Sample s=m::display; //referring method using reference

s.display("Mamta"); //calling intetface method
}
}