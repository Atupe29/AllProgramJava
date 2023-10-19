import java.util.ArrayList;
public class ArrayListDemo{
public static void main(String args[]){
	
ArrayList al = new ArrayList();
System.out.println("Initial size of ArrayList: "+al.size());

al.add("Red");
al.add("Green");
al.add("Blue");
al.add("Pink");
al.add("Orange");

System.out.println("\nSize of ArrayList after addition:"+ al.size());

System.out.println("\nContents of ArrayList After add:"+ al);

al.remove(4);
System.out.println("\nContents of ArrayList after remove index:"+ al);

al.remove("Pink");
System.out.println("\nContents of ArrayList after remove object:"+al);
System.out.println("\nSize of ArrayList after deletions:"+al.size());

String alElement = (String)(al.get(1));
System.out.println("alElement:"+alElement);

al.add(2,alElement+"rose");
System.out.println(al);
}
}