public class ArrayListEg{
public static void main(String[]args){
//creating arraylist
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
al.add("Orchid");
al.add("Lotes");
al.add("5,Lavander");
//printing arrayList object
System.out.println(al);
System.out.println("Size of arraylist:"+al.size());
//removeing element at index 5
al.remove(5);
//printing arrayList after remove
System.out.println(al);
System.out.println("Size of arraylist:"+al.size());
System.out.println("elements of index value is:"+al.get(6));
}
}
