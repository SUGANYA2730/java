package java8eg;

import java.util.ArrayList;
import java.util.List;

public class foeEachEg{
public static void main(String args[]){
List<String> flower=new ArrayList<String>();
flower.add("Rose");
flower.add("Jasmine");
flower.add("Sunflower");
flower.add("Marigold");
flower.add("Lilly");
flower.forEach(display->System.out.println(display));//iterating with lambda expression
}
}
