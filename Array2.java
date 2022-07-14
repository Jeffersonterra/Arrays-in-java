import java.util.*;  
public class Array2{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Jeff");  
v.add("Lari morzao");  
v.add("Mari");  
v.add("manu");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
