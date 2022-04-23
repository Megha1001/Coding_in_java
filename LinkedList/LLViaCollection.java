import java.util.*;

class LLViaCollection {
   
    public static void main(String [] args){
      LinkedList<String> list = new LinkedList<>();
      
      list.addFirst("a");
      list.addFirst("is");
      
      System.out.println(list);
      
      list.addFirst("list");
      list.addLast("list");
      list.add("."); //by default add at last
      
      System.out.println("Elements in list are : "+list);
      System.out.println("Size of list : " + list.size());
      
      // printing linked list
      for(int i = 0 ; i < list.size() ; i++){
          System.out.print(list.get(i)+ "->");
      }
      System.out.print("NULL");
      
      list.removeFirst();
      System.out.println(list);
      
      list.removeLast();
      System.out.println(list);
      
      list.remove(1);
      System.out.println(list);
    }
}
