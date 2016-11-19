import java.util.*;  
class Test1{  
 public static void main(String args[])
 {  
   
  ArrayList<String> al=new ArrayList<String>();
  //ArrayList<int> a2=new ArrayList<int>();
 // ArrayList<float> a3=new ArrayList<float>();
   
  al.add("gautam");  
  al.add("kalpesh");  
  al.add("sanjay");  
  al.add("minesh");
  
   Iterator itr=al.iterator();  
   while(itr.hasNext())
   {  
   System.out.println(itr.next());  
   }  
 }  
}  