public class ReverseArrayList{
public static void main(String[]args){
//creating arraylist
List<string>al = new ArrayList<String>();
al.add("Rose");
al.add("Sunflower");
al.add("Rose");//duplicate
al.add("Lily");
al.add("Daisy");
al.add("Marigold");
al.add("Tulip");
al.add("Jamine");
System.out.println("Before Reversing");
System.out.println(al.toString());

Collections.reverse(al);
System.out.println("After Reversing");
System.out.println(al);
}
}