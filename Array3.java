import java.util.*;  
public class Array3{  
public static void main(String args[]){  
Stack<String> stack = new Stack<String>();  
stack.push("Lari"); 
stack.push("Perera");  
stack.push("Jefferson");  
stack.push("Terra");  
stack.push("Magalhaes");  
stack.push("Cardoso");  
stack.push("Lis Terra");  
stack.push("Olivia Cardoso");  
stack.pop();  
Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
