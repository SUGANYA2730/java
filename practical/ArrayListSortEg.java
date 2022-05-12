package CollectionEg;
import java.util.ArrayList;
import java.util.List;
public class ArrayListSortEg{
public static void main(String[] args){
List<string>al=new ArrayList<String>();

//adding object to arraylist
al.add("Rose");
al.add("Sunflower");
al.add("Rose");//duplicate
al.add("Lily");
al.add("Daisy");
al.add("Marigold");
al.add("Tulip");
al.add("Jamine");
System.out.println("String sorted list:");
//sorting al
Collections.sort(al);
for(String a:al){
System.out.println(a);
}

List<Integer> al1 = new ArrayList<Interger>();
al1.add(20);
al1.add(45);
al1.add(24);//duplicate
al1.add(89);
al1.add(66);
al1.add(27);
al1.add(37);
al1.add(85);

System.out.println("Integer sorted list");
//sorting al1
Collections.sort(al1);
for(integer i:al1){
System.out.println(i);
}

