package CollectionEg;
import java.util.ArrayList;
import java.util.List;
public class ArrayListUsingIteratorEg{
public static void main(String[] args){
List<string>al=new ArrayList<String>();
//adding object to arraylist
al.add("Rose");
al.add("Sunflower");
al.add("Rose");
al.add("0,Lily");
al.add("2,Daisy");
al.add("Marigold");
al.add("6,Tulip");
al.add("Jamine");

System.out.println("traversing using for loop");
for(int i=0; i<al.size(); i++){
System.out.println(al.get(i));
}

System.out.println("traversing using for each loop");
for(String i:al){
System.out.println(i);
}
System.out.println("traversing using list iterator");
ListIterator<String> itr= al. listIterator();//getting the iterator
while(itr.hasNext()){//checking iterator has elements
System.out.println(itr.next());//printing elements &move to next
}

System.out.println("traversing using list iterator-forward");
ListIterator<String> itr1= al. listIterator();//getting the iterator
while(itr1.hasNext()){//checking iterator has elements
System.out.println(itr1.next());//printing elements &move to next
}

System.out.println("traversing using list iterator-backward");
ListIterator<String> itr2= al. listIterator();//getting the iterator
while(itr2.hasPrevious()){//checking iterator has elements
System.out.println(itr2.previous());//printing elements &move to next
}
}
}
