import java.util.*;

// Using extra memory of O(N)
class ReverseLLWithExtraMemory {
   
    public static void main(String [] args){
      LinkedList<String> list = new LinkedList<>();
      
      list.addFirst("a");
      list.addFirst("is");
      
      System.out.println(list);
      
      list.addFirst("this");
      list.addLast("list");
      list.add("."); //by default add at last
      
      System.out.println("Elements in list are : "+list);
      System.out.println("Size of list : " + list.size());
      
      // printing linked list
      for(int i = 0 ; i < list.size() ; i++){
          System.out.print(list.get(i)+ "->");
      }
      System.out.println("NULL");
      
    //   list.removeFirst();
    //   System.out.println(list);
      
    //   list.removeLast();
    //   System.out.println(list);
      
    //   list.remove(1);
    //   System.out.println(list);
      
      LinkedList<String> reverseLinkedList = new LinkedList<>();
      
      for(int i = list.size() -1 ; i >= 0  ; i--){
        reverseLinkedList.addLast(list.get(i));
        System.out.print(list.get(i)+ "->");
      }
      System.out.println("NULL");
    }
}
