import java.util.*;  
public class Array1{  
public static void main(String args[]){  
LinkedList<String> al=new LinkedList<String>();  
al.add("Jeff");  
al.add("Lari");  
al.add("Mari");  
al.add("Manu");  
Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
} 
